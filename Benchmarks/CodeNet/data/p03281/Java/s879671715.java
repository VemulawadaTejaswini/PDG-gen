import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int ans = 0;
		
		for(int i = 1;i <= N;i+=2) {
			int count = 0;
				for(int j = 1;j <= i/2;++j)
					if(i % j == 0)
						count++;
			if(count == 7)
				ans++;
		}
		
		System.out.println(ans);
	}

}