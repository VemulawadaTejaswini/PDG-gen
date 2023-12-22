import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if(x==0 && y==0) {
				break;
			}

			int a,b,c;
			int count = 0;

			for(int i=1;i<=x;i++) {
				for(int j=i+1;j<=x;j++) {
					for(int k=j+1;k<=x;k++) {
						a = i;
						b = j;
						c = k;
						if(a+b+c==y) {
							count++;
						}
					}
				}
			}

			System.out.println(count);
		}
		sc.close();
	}
}
