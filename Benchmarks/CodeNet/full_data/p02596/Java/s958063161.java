import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		float A = 7;
		int a = 0;
		int k = String.valueOf( K ).length();
		
		if((K % 2) == 0) {
			System.out.println(-1);
		}else {
			for (int f = 1; f < k;  f++) {
				A = (A * 10) + 7; 
			}
			for(int i = k;  i < (k * 10); i++) {
				if((A%K) == 0) {
					a = i;
					i = i + 1000000;
				}
				else						A = (A * 10) + 7; 
				//System.out.println(A);
				//System.out.println(A / K + "/n");
			}
			
			if(0 < a)						System.out.println(a);
			else								System.out.println(-1);
		}
	}
}
