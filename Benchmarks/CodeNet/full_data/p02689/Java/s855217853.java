import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		
		int N = scr.nextInt();
		int M = scr.nextInt();
		int A;
		int B;
		
		int result = 0;
		
		int []Ns = new int [N];
		int []Max = new int [N];
		
		for(int i = 0;i < N;i++) {
			Ns[i] = scr.nextInt();
			Max[i] = Ns[i];
		}
		
		
		for(int i = 0;i < M;i++) {
			A = scr.nextInt();
			B = scr.nextInt();
			if(Ns[A-1] <= Ns[B-1]) {
				Max[A-1] = -1;
				
			}
			if(Ns[A-1] >= Ns[B-1]) {
				Max[B-1] = -1;
			}
		}
		
		for(int i = 0;i < N;i++) {
			if(Max[i] != -1) {
				result += 1;
			}
		}
		
		System.out.println(result);
		
	}
}