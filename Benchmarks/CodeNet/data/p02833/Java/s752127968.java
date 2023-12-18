import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long count=0;
		if(n%2==0) {
			for(int i=10;i<=n;i+=10) {
				if(i%10==0) {
					count++;
				}
			}
			System.out.println(count);
		}else {
			System.out.println(0);
		}
	}
}


