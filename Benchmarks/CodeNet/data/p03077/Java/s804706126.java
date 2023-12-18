import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		long n =sc.nextLong();
		long a[] =new long[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		
		
		
		System.out.println(4+(n+a[0]-1)/a[0]);

}
}



