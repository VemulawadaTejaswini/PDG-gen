import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=N,b=0;
		while(a>0) {
			b=b+a%10;
			a=a/10;
		}
		if(N%b==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}