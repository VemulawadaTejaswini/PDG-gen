import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int B =0;
		int L =0;
		int O =0;
		int P =0;
		int Q =0;
		int R =0;
		int min = 100000;
		
		for(int A=1; A<N; A++){
			B=N-A;
			P=A;
			L=0;
			O=0;
			R=0;			
			for(int X=0;X<=6;X++){
				L += B%10;
				B = B/10;
			}	
			for(int Y=0;Y<=6;Y++){
				O +=P%10;
				P = P/10;
			}
			
			R = L+O;
			if(R<min){
				min = R;
			}
		}
		System.out.println(min);
	}
}	