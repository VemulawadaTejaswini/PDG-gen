import java.util.Scanner;


public class Main {
	static int N;
	static int square[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			N = sc.nextInt();
			if(!(N==0))
				new Main().solve();
		}
	}
	void solve(){
		square = new int[N][N];
		int x=N/2,y=N/2+1;
		square[x][y]=1;
		
		for(int i=2; i<=N*N; i++){
			x=(x+1)%N;
			y=(y+1)%N;
			while(!(square[x][y]==0)){
				x=(x-1+N)%N;
				y=(y+1)%N;
			}
			square[x][y]=i;
		}
		Print();
	}
	void Print(){
		for(int i=0;i<N;i++){
			for(int j=0; j<N; j++){
				System.out.printf("%4d",square[j][i]);
			}
			System.out.println("");
		}
	}
}