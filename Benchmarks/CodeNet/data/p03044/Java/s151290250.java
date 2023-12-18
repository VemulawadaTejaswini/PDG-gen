import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());


		int[] u = new int[N-1];
		int[] v = new int[N-1];
		int[] w = new int[N-1];
		for(int i=0;i<N-1;i++){
			u[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
			w[i] = Integer.parseInt(sc.next());
		}
		boolean[] isBlack = new boolean[N];



		
		for(int i=0;i<N-1;i++){
			if(w[i]%2==1){
				isBlack[u[i]-1]=true;
				isBlack[v[i]-1]=true;
			}
		}


		for(int i=0;i<N;i++) {
			if(isBlack[i]){
				System.out.println(1);
			}else{
				System.out.println(0);
			}

		}
	}
}