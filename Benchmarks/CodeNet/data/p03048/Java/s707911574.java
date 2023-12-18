import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int R = scan.nextInt();
			int G = scan.nextInt();
			int B = scan.nextInt();
			int N = scan.nextInt();


			int count = 0;

			for(int r = 0;R*r<=N;r++) {
				for(int g = 0;G*g<=N-R*r;g++) {
					int S = N-R*r-G*g;

					if(S>=0&&S%B==0) {
						//System.out.println(r+" "+g+" "+S/B);
						count++;
					}
				}
			}


			System.out.println(count);



		}


	}


}
