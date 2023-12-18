import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int ans = 0;

		for(int i=3;i<=13;i+=2) {

			for(int j=i+2;j<=13;j+=2) {

				for(int k=j+2;j<=13;j+=2) {

					if(i*j>N || i*j*k>N) break;

					ans++;
				}
			}
		}

		if(N>=189) ans+=2;

		else if(N>=135) ans++;

		System.out.println(ans);

	}

}
