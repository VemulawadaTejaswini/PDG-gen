import java.util.Scanner;


public class Main {
	static int cnt=0;
	static int N;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		boolean[][] path =new boolean[N][N];
		for(int i=0;i<N;i++) for(int j=0;j<N;j++) path[i][j]=false;
		for(int i=0;i<M;i++){	//隣接行列の受け取り
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			path[(a-1)][(b-1)] = true;
			path[(b-1)][(a-1)] = true;
		}
		
		boolean[] position = new boolean[N];//訪問済みならtrue
		position[0]=true;
		for(int i = 1; i<N;i++) position[i]=false;//初期化
		
		Search(path, 0, position);
		
		System.out.println(cnt);
		sc.close();
	}
	
	public static void Search(boolean[][] path, int NowPos, boolean[] PastPos){
		boolean fin = true;//全て訪問済みならtrue
		for(boolean Posi: PastPos) fin = (fin && Posi);
		
		boolean[] NewPos = new boolean[N];
		for(int i=1;i<N;i++) NewPos[i]=PastPos[i];
		
		if(fin)	cnt++;
		for(int i=1;i<N;i++){
			if((!PastPos[i])&&path[NowPos][i]){
				NewPos[i]=true;
				Search(path,i,NewPos);
			}
		}
	}
}