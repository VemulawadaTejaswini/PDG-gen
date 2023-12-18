import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();

		if(b-a+1>=2*k) {
			for(int i=0; i<k;i++) {
				System.out.println(a+i);
			}

			for(int i=0; i<k; i++) {
				System.out.println(b-k+1+i);
			}

		}else {
			for(int i=a; i<=b;i++) {
				System.out.println(i);
			}
		}
	}
}