public class SongLauncher extends Fragment implements ISongLauncher{

    SongAdapter mSongAdapter;
    Fragment mSongStateFragment;
    IActivityFragmentInteractor mInteracter;

    public SongLauncher() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void setInteracter(IActivityFragmentInteractor interacter) {
        mInteracter = interacter;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_song_launcher, container, false);
        Inventory.getInstance().songLauncherController(this);
        init(view);
        return view;
    }

    private void init(View view){
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.song_list_recycler_view);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        mSongAdapter = new SongAdapter(Inventory.getInstance().getSongsList());
        mSongStateFragment = getFragmentManager().findFragmentByTag("102");
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(mSongAdapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Log.d("Clicked", ":" + position);
                        Inventory.getInstance().updateLastPlayed(position);
                        if (mInteracter != null){
                            mInteracter.nowPlaying();
                        }

                    }
                })
        );
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onListUpdated() {
        mSongAdapter.setSongLists(Inventory.getInstance().getSongsList());
    }
}
public class MainActivity extends AppCompatActivity implements IActivityFragmentInteractor{

    private TextView mTextMessage;
    private Retrofit retrofit;
    Fragment mActiveFragment;
    volatile int dataPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataPresent = 0;
    }

    @Override
    protected void onStart() {
        super.onStart();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        callEndpoints();

        final SongState songStateFragment = new SongState();
        final SongLauncher songLauncherFragment = new SongLauncher();
        songLauncherFragment.setInteracter(this);
        final FragmentManager fm = getSupportFragmentManager();
        mActiveFragment = songLauncherFragment;
        fm.beginTransaction().add(R.id.main_container, songLauncherFragment, "101").commit();
        fm.beginTransaction().add(R.id.main_container, songStateFragment, "102").hide(songStateFragment).commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        fm.beginTransaction().hide(mActiveFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).show(songLauncherFragment).commit();
                        mActiveFragment = songLauncherFragment;
                        return true;
                    case R.id.navigation_dashboard:
                        fm.beginTransaction().hide(mActiveFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).show(songStateFragment).commit();
                        mActiveFragment = songStateFragment;
                        return true;
                }
                return false;
            }
        });

    }

    private void callEndpoints() {
        InventoryController inventoryController = retrofit.create(InventoryController.class);

        inventoryController.listSongs()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<List<SongList>>() {
                    @Override
                    public void onSuccess(List<SongList> songLists) {
                        //Log.d("New Song", "Size: " + songLists.size() + songLists.get(1).getArtist() + " " + songLists.get(2).getArtist());
                        Inventory.getInstance().setSongsList(songLists);
                        dataPresent = 1;
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("SongList", "Error" + e);
                    }
                });
    }

    @Override
    public void nowPlaying() {
        if (mActiveFragment == getSupportFragmentManager().findFragmentByTag("101")){
            getSupportFragmentManager().beginTransaction().hide(mActiveFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .show(getSupportFragmentManager().findFragmentByTag("102")).commit();
            mActiveFragment = getSupportFragmentManager().findFragmentByTag("102");
        }
    }
}

public interface IActivityFragmentInteractor {
    void nowPlaying();
}
