
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		int odd = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			if(a[i]% 2 == 1){
				odd++;
			}
		}

		int even = n - odd;

		if(odd % 2 == 1){
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}

	}
}
