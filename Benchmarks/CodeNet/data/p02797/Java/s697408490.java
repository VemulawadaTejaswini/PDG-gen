import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long N = scan.nextLong();
			long K = scan.nextLong();
			long S = scan.nextLong();


			long count = 0;

			for(int i = 0;i<N;i++) {
				if(count<K) {
					System.out.print(S+" ");
					count++;
				}else{
					System.out.print((S+1)+" ");
				}
			}

		}


	}


}
