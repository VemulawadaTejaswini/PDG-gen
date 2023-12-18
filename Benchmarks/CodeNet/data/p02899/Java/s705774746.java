import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int toukou = 1;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		while(true) {
			if(toukou == n+1) {
				return;
			}
			for(int i = 0; i < n; i++) {
				if(a[i] == toukou) {
					System.out.println(i+1);
					toukou++;
				}
			}
		}
		
		

	}
}
