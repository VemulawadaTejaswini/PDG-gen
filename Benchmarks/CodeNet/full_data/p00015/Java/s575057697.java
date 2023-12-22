import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 0 ;
		long b = 0 ;
		int n = sc.nextInt();
		while(0!=n--){
			a=sc.nextLong();
			b=sc.nextLong();
			System.out.println(a+b);
		}
	}
}