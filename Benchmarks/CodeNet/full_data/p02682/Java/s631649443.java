import java.util.Scanner;

public class Main {
	static int A;
	static int B;
	static int C;
	static int K;
	static int x;
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		K=sc.nextInt();
		if(K-A>=0) {
			for(int n=0;n<A;n++) {
				x++;
			}
			if(K>=A+B) {
				for(int n=0;n<K-A-B;n++) {
					x--;
				}
			}
		}
		else {
			for(int n=0;n<K;n++) {
				x++;
			}
		}
		System.out.println(x);
	}
}