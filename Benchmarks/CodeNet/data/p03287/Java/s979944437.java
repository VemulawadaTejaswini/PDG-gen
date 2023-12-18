import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long arr[] = new long[N];
		long p[] = new long[N];
		HashMap<Long,Integer> mods = new HashMap<>();

		for(int n=0;n<N;n++){
			arr[n] = sc.nextLong();
			if(n==0) p[n] = arr[n];
			else p[n] = p[n-1] + arr[n];
		}


		long ans = 0;

		mods.put((long)0,1);

		for(int n=0;n<N;n++){

			if(mods.containsKey(p[n]%M)){
				mods.put(p[n]%M,mods.get(p[n]%M)+1);
			}
			else
				mods.put(p[n]%M,1);
		}

		for(Long key : mods.keySet()){
			int v = mods.get(key);
			ans += v*(v-1)/2;
		}

		System.out.println(ans);
	}
}