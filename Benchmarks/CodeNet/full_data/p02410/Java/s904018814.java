import java.util.Scanner;

class Clc{
	private int[][] NM;	//n*m?????????
	private int[] M1;	//m???1?????????	
	private int[] result;
	//---?????????????????????---//
	Clc(int[][] nm,int[] m1, int N){
		NM	= 	nm;
		M1	=	m1;
		result = new int[N];
	}
	
	int[] getclc(int N,int M){
		for(int x = 0; x < N ; x++){
			for(int y = 0; y < M; y++){
				result[x]=result[x]+NM[x][y]*M1[y];
			}
		}
		return result;
	}
	int[] get(int N){
		return M1;
	}
	
	
	
}
public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[][] NM  = new int[N][M];
		int[] M1	= new int[M];
		
		for(int x = 0 ; x < N ;x++){
			for(int y = 0; y < M ; y++){
				NM[x][y]=scanner.nextInt();
			}
		}
		
		for(int i = 0; i < M ; i++){
			M1[i] = scanner.nextInt();
		}
		
		Clc seki = new Clc(NM, M1, N); 
		int[] result = seki.getclc(N,M);
		
		for(int i = 0;i < N ; i++){
			System.out.println(result[i]);
		}
		scanner.close();
	}

}