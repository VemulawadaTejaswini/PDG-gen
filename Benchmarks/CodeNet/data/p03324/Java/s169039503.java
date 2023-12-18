import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int d = stdIn.nextInt();
		int n = stdIn.nextInt();
		int no = 0;
		long ans = 0;
		long seisu = 1;
		for(int j = 0; j < d; j++) {
			seisu *= 100;
		}	
		for(int i = 1; i <= n; i++) {
			if(d == 0) {
				no++;
			}
			ans += seisu;
		}
		
		if(d==0) {
			System.out.println(no);
		}else {
			System.out.println(ans);
		}
	}

}
