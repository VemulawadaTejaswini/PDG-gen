import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		long sum = 0;
		for(int i = 1; i<=num; i++) {
			if(i%3==0||i%5==0) {

			}else{sum=sum+i;}
		}
		System.out.println(sum);
	}
}
