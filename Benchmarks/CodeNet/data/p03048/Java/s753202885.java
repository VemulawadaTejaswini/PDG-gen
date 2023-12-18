import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int count=0;

		int ball = 0;
		for(int i=0;(R*i)<=N;i++) {
			for(int j=0;(R*i)+(G*j)<=N;j++) {
				for(int k=0;(R*i)+(G*j)+(B*k)<=N;k++) {
					ball = (R*i)+(G*j)+(B*k);
					if(N == ball) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}

}
