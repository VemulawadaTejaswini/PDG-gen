
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		char[] S = sc.next().toCharArray();

 		int[] d = new int[N];
		d[0] = 0;
		int count = 0;
		for(int i=1; i<N; i++){
			if(S[i]=='C' && S[i-1]=='A'){
				count++;
			}
			d[i] = count;
		}

		for(int i=0; i<Q; i++){
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			System.out.println(d[r-1]-d[l-1]);
		}
		
		
		
		sc.close();
	}

	
}
