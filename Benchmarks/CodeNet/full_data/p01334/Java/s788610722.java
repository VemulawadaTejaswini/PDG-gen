import java.util.Scanner;

public class Main {

	static int N;
	static int[][][] field;
	static int[][] already;
	static boolean[][] isLoop;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			N=cin.nextInt();
			if(N==0)break;
			field=new int[N][N][2];
			already=new int[N][N];
			isLoop=new  boolean[N][N];
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					field[j][i][0]=cin.nextInt();
					field[j][i][1]=cin.nextInt();
				}
			}int ans=0,cnt=1;;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					int[] a=a(j,i,cnt++);
//					System.out.println(j+" "+i+" "+a[0]+" "+a[1]);
					if(a[0]==j&&a[1]==i&&!isLoop[j][i]){
						ans++;
//						System.out.println("aaaaaa"+j+" "+i);
						b(j,i);
					}
				}
			}
			System.out.println(ans);
		}
	}
	static void b(int y,int x){
		if(isLoop[y][x])return;
		isLoop[y][x]=true;
		int a=field[y][x][0];
		int b=field[y][x][1];
		b(a,b);
	}
	static int[] a(int y,int x,int cnt){
//		System.out.println("   "+y+" "+x);
		//field[y][x]
		int a=field[y][x][0];
		int b=field[y][x][1];
		if(already[y][x]==cnt)return new int[]{y,x};
		already[y][x]=cnt;
		
		return a(a,b,cnt);
	}
}