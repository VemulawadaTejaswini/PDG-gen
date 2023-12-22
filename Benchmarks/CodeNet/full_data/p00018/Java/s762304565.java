import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] ar = new int[5];
		for(int i = 0; i < 5; i++) {
			ar[i] = stdIn.nextInt();
		}
		
		Arrays.sort(ar);
		System.out.print(ar[4]);
		for(int i = 3; i >= 0; i--) {
			System.out.print(" " + ar[i]);
		}
		System.out.println();
	}

}