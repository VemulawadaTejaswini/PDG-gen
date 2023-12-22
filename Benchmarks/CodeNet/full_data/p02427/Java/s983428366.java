import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = (int)Math.pow(2, n)-1;
		
		System.out.println("0:");
		
		for(int i=1; i<=m; i++) {
			String binary = Integer.toBinaryString(i);
			System.out.print(i + ":");

			for(int j=0; j<binary.length(); j++) {
				char one = binary.charAt(binary.length()-j-1);
				if(one == '1') System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}
