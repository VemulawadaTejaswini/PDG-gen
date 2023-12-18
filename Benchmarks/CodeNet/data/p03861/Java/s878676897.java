import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		long div = sc.nextLong();
		sc.close();
		int count = 0;
		for(long i = n1; i <= n2; i++){
			if(i % div ==0) count++;
		}
		System.out.println(count);
	}
}
