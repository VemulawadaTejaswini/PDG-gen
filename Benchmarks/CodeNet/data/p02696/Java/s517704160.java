import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,N;
		
		A=sc.nextInt();
		B=sc.nextInt();
		N=sc.nextInt();
		int max=0;
		
		for(int i=0;i<=N;i++) {
		
			int a=(A*i)/B-A*(i/B);
			if(a>max) max=a; 
		}
		System.out.println(max);
	}
}
