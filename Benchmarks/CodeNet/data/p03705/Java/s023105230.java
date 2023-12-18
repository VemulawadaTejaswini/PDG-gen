import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = sc.nextLong();
		long max = sc.nextLong();
		if(n==1&&min==max){
			System.out.println(1);
		}else if(min > max || n < 2) {
			System.out.println(0);
		} else {
			System.out.println((max-min)*(n-1)-max+min+1L);
		}
	}
}