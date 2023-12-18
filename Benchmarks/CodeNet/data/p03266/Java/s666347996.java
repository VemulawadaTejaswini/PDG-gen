import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();


		int ans = 0;


			for(int a=1;a<=N;a++) {

				for(int b=K-a;b<=N;b+=K) {

					for(int c=K-a;c<=N;c+=K) {

						if(b<1) break;


						if((b+c)%K==0 && (a<=b && a<=c && b<=c)&&c>=1) {


							if(a!=b && b!=c && c!=a) ans+=6;

							else if(a!=b && a==c) ans+=3;

							else if(b!=c && b==a) ans+=3;

							else if(c!=a && b==c) ans+=3;

							else ans++;

						}

					}
				}
			}




		System.out.println(ans);

	}



}
