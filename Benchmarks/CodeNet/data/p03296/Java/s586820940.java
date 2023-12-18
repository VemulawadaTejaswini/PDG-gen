
import java.util.Scanner;

public class Main {
	public static int N = 0;
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int a[] = new int[N];
		
		for(int i = 0;i < N;i++) {
			a[i] = scan.nextInt();
		}
	
		for(int i=1;i < a.length-1;i++) {
			if(a[i] == a[i-1] || a[i] == a[i+1]) {
				count++;
				if(a[i] == a[i+1]) {
					i++;
					if(a[i+1] == a[i+2]) {
						count--;
					}
				}
			}
		}
		scan.close();
		System.out.println(count);
	}
}