import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

class Main {
  public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
		String tokens1[] = scanner.nextLine().split(" ");
		String tokens2[] = scanner.nextLine().split(" ");
		int min = Integer.parseInt(tokens2[0]);
		int count = 1;
		for ( int i = 1; i < tokens2.length; i++) {
			int val = Integer.parseInt(tokens2[i]);
			if (val <= min) {
				count++;
			}
			min = Math.min(min, val);
		}
		System.out.print(count);
		

        
  }
}
