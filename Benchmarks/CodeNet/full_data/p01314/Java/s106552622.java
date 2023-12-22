import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {

			int n = scan.nextInt();
			int count = 0;
			
			if (n == 0)
				break;

			for (int i = 1; i < n; i++) {
				int sum = 0;
				int j = i;
				while(sum<n){
					sum+=j;
					if(sum==n)count++;
					j++;
				}

			}
			System.out.println(count);
		}
		scan.close();
	}
}