import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int need = n/2;
		int cnt = 0;
		
		for(int i = 0; i < n-1; i++) {
			
			if(a[i]*a[i+1]%2==0) {
				cnt++;
			}
		}
		if(cnt/2>=need) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
