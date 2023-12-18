import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt();
		boolean f=true;
		for(int i=0;i<N;i++ ) {
			int t=sc.nextInt();
			if(f&&t%2==0) {
				if(t%3==0||t%5==0) {
					continue;
				}else {
					f=false;
					break;
				}
			}
		}
		System.out.println(f?"APPROVED":"DENIED");
	}
}
