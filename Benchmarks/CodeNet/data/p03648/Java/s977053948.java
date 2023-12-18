
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Long k=sc.nextLong();
		int N=50;
		System.out.println(N);
		int b=(int) (N-1+k/N-k%N);
		//System.out.println(b);
		for (int i = 0; i <N; i++) {
			System.out.print(b+ (i<k%N?N:0)+ (i==N-1 ? "\n" : " "));
		}
		

	}

}
