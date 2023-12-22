import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		int[] hurui = new int[1000000];
		Arrays.fill(hurui, 1);
		for(int i=2 ; i < 1000000 ; i++) {
			if(hurui[i] == 0)
				continue;
			for(int j=2 ; i*j < 1000000 ; j++) {
				hurui[i*j] = 0;
			}
		}

		hurui[1] = 0;
		for(int i=2 ; i<1000000 ; i++) {
			hurui[i] += hurui[i-1];
		}


		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int input = Integer.parseInt(s.nextLine());
			System.out.println(hurui[input]);
		}
	}

}