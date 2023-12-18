import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		long a = as.nextLong();
		long b = as.nextLong();
		long n = as.nextLong();
		long l = 0;
		l = b/n-a/n+1;
		System.out.println(l);
	}
}