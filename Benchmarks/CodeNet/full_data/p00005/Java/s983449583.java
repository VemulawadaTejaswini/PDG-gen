import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextInt() ) {
			Integer[] ary = new Integer[2];
			ary[0] = scan.nextInt();
			ary[1] = scan.nextInt();
			
			Arrays.sort(ary);
			
			int divisor = 1, multiple = 1;
			
			for(int i = 1; i <= ary[0]; i++) {
				if((ary[0] % i == 0) && (ary[1] % i == 0)) {
					divisor = i;
				}
			}
			
			for(int i = ary[1]; ; i++) { 
				if((i % ary[0] == 0) && (i % ary[1] == 0)) {
					multiple = i;
					break;
				}
			}
			
			System.out.println(divisor + " " + multiple);
		}
	}
}