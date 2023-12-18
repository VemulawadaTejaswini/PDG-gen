import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		boolean flag1 = true;
 		b[0] = 1;
		for(int i = 1; i < n ; i++) {
			b[i] = a[i] - a[i-1];
			
			if(b[i] >= 1)
				a[i]++;
			if(b[i] <= -1) {
				flag1 = false;
			break;
				
			}
		}
		
		if(flag1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	

	}}
