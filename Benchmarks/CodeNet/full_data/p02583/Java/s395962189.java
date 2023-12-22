//s

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		Integer X = sc.nextInt();
		Integer K = sc.nextInt();
		Integer D = sc.nextInt();
		sc.close();

		Integer tmp = X/D;
		
		Integer moveCount;
		
		if(K < tmp) {
			moveCount = K;
		}
		else {
			moveCount = ( K % 2 == tmp % 2 )? tmp : tmp + 1;
		}

		Integer movedIndex = X - D * moveCount;
		System.out.println(movedIndex);

	}

}
