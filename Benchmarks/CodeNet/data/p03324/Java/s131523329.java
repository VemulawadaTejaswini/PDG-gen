import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt();
		int n=sc.nextInt();
		int tmp=1;
		if(d==0) {
			System.out.println(n+d/100);
		}else {
			for(int i=0;i<d;i++) {
				tmp*=100;
			}

			System.out.println(n<100?tmp*n:tmp*(n+1));
		}
	}
}