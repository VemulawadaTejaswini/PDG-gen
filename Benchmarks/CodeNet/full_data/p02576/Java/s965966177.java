import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int T=sc.nextInt();
		int a=N/X;
		
		if(N%X!=0) {
			System.out.println(T*(a+1));
		}else {
			System.out.println(T*a);
		}
	}

}