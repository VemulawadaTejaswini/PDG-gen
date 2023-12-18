import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong(),x=sc.nextLong();
		System.out.println(a%0==0?b/x-a/x+1:b/x-a/x);
		sc.close();
	}
}