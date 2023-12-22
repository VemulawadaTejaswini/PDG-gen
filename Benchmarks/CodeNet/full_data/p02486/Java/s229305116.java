
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int x;
		int num = 0;
		int a,b,c;
		while (true) {
			n = scanner.nextInt();
			x = scanner.nextInt();
			if(n==0&&x==0)
				break;
			num = 0;
			for(a=1;a<=n;a++){
				for(b=a+1;b<=n;b++){
					for(c=b+1;c<=n;c++){
						if(a+b+c==x)
							num++;
					}
				}
			}

			System.out.println(num);
		}
		scanner.close();
	}
}