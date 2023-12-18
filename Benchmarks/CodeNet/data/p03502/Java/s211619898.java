import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		atcode();
	}

	public static void atcode() {
		Long num=Long.valueOf(new Scanner(System.in).nextLine());
		int sum=0;
		for(long temp=num;temp>0;temp/=10) {
			sum+=temp%10;
		}
		System.out.println(num%sum==0?"Yes":"No");
	}
}