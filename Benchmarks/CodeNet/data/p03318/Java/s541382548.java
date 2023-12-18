import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		long K = Long.parseLong(inputLine);
		
		for(int i = 1;i < K && i < 10;++i)
			System.out.println(i);
		if(K >= 10)
			for(int i = 1;i <= K-9;++i) {
              	if(i % 10 == 0)++i;
				System.out.print(i%10);
				for(int j = 0;j <= i/10;++j)
					System.out.print('9');
				System.out.println();
			}
	}
}
