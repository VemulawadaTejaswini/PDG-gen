import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	for(int i=0;i<M;i++) {
		int a=1+i;
		int b=N-i;
		System.out.println(a+" "+b);
	}
	}
}
