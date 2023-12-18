import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int R = sc.nextInt();
			int G = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();

		sc.close();

		int count = 0 ;

		for(int i = 0 ; i <= N ; i++){
			for(int j = 0 ; j <= N-i ; j++){

				int p = N - (R * i) - (G * j);


				if(p % B == 0 && i+j+(p/B) <= N && p>= 0){
					count++;

					//System.out.println(i+" "+j+" "+p/B);
				}


			}
		}

		System.out.println(count);
	}
}
