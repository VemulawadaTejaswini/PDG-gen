import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int T = 0;
		int t = 0;
		while(C>T){
			t++;
			if(t%7 == 0){
				T += B;
			}
			T += A;
		}
		System.out.println(t);
	}
}
