import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int max = (int)Math.pow(2,n) - 1;
			System.out.println("0:");
			for (int i = 1; i<=max; i++) {
				System.out.print(i+":");
				String binary = Integer.toBinaryString(i);
				for (int j=0; j<binary.length(); j++) {
					char c =  binary.charAt(binary.length()-j-1);
					if (c == '1') System.out.print(" "+ j);
				}
				System.out.print('\n');
			}
		}
	}
}
