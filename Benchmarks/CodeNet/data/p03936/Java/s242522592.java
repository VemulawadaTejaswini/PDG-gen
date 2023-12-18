import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}

	static int h, w, n, k, f[][];

	private static void input(){
		h=s.nextInt();
		w=s.nextInt();
		n=s.nextInt();
		k=s.nextInt();
		f=new int[h][w];
	}

	private static void solve(){
		// loop:
		for(int i=0; i<h; i++){
			int rowsum=question(i,0,i,w-1);
			for(int j=0; j<w-2&&rowsum!=0; j+=4){
				int buf=question(i,j,i,j+3);
				rowsum-=buf;
				switch(buf){
				case 0:
					break;
				case 1:
					buf=question(i,j  ,i,j+1)==0?j+2:j  ;
					f[i][buf  ]=question(i,buf,i,buf);
					f[i][buf+1]=1-f[i][buf];
					break;
				case 2:
					buf=question(i,j,i,j+1);
					switch(buf){
					case 0:
						f[i][j  ]=0;
						f[i][j+1]=0;
						f[i][j+2]=1;
						f[i][j+3]=1;
						break;
					case 1:
						f[i][j  ]=question(i,j  ,i,j  );
						f[i][j+1]=1-f[i][j  ];
						f[i][j+2]=question(i,j+2,i,j+2);
						f[i][j+3]=1-f[i][j+2];
						break;
					case 2:
						f[i][j  ]=1;
						f[i][j+1]=1;
						f[i][j+2]=0;
						f[i][j+3]=0;
						break;
					}
					break;
				case 3:
					if(question(i,j  ,i,j+1)==2){
						f[i][j  ]=1;
						f[i][j+1]=1;
						f[i][j+2]=question(i,j+2,i,j+2);
						f[i][j+3]=1-f[i][j+2];
					}else{
						f[i][j  ]=question(i,j  ,i,j  );
						f[i][j+1]=1-f[i][j  ];
						f[i][j+2]=1;
						f[i][j+3]=1;
					}
					break;
				case 4:
					f[i][j  ]=1;
					f[i][j+1]=1;
					f[i][j+2]=1;
					f[i][j+3]=1;
					break;
				}
			}
			if(h%4!=0&&rowsum>0){
				f[i][w-2]=question(i,w-2,i,w-2);
				rowsum-=f[i][w-2];
				f[i][w-1]=rowsum;
			}
		}

		long pow=1, result=0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				result+=f[i][j]*pow;
				result%=k;
				pow*=2;
				pow%=k;
			}
		}

		//Arrays.stream(f).map(Arrays::toString).forEach(System.out::println);

		answer(result);
	}

	private static final int question(int x1, int y1, int x2, int y2){
		System.out.printf("? %d %d %d %d\n",x1,y1,x2,y2);
		return s.nextInt();
	}

	private static final void answer(long a){
		System.out.printf("! %d\n",a);
	}
}
