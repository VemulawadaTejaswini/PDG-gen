import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[] prize = new int[]{6000, 4000, 3000, 2000};
		
		for(int i = 0; i < 4; i++){
			final int t = sc.nextInt() - 1;
			final int n = sc.nextInt();
			
			System.out.println(prize[t] * n);
		}
		
	}

}