
import java.util.Scanner;

public class Main {
	public static int co = 0;
	public static int count = 0;
	public static int n = 0;
	public static int m = 0;
	public static int d = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		d = scan.nextInt();
	
		int num[] = new int[m];
		array(num,0);
		System.out.println(count / co);
		scan.close();
	
	}
	
	public static Object array(int[] num,int s) {
		if(s == m) {
			co++;
			for(int k = 0;k < m-1;k++) {
				if(Math.abs(num[k] - num[k+1]) == d) {
					count++;
				}
			}
		}else {
			for(int i = 0;i < n;i++) {
				num[s] = i+1;
				array(num,s+1);
			}
		}
		
		return null;
	}
}