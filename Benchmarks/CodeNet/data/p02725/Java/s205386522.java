
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	 Scanner scan = new Scanner(System.in);
	 
	 int k = scan.nextInt(); 
	 int n = scan.nextInt();
	 int[] a = new int[n];
	 
	 for(int i = 0; i < n; i++ ) {
		 a[i] = scan.nextInt();
	 }
	 
	 int first = a[n-1] - a[0];
	 int end = k - a[n-1] + a[n-2];
	 
	 if(first < end) {
		 System.out.println(first);
	 }
	 else {
		 System.out.println(end);
	 }
}
}
