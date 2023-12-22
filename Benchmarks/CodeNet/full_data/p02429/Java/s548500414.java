import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int tBit = 0;
			for(int i = 0; i < k; i++) {
				int j = sc.nextInt();
				if((tBit>>j&1)==0)
					tBit += 1<<j;
			}
			System.out.println("0:");
			for (int bit = 1; bit < (1<<n); bit++) {
				if((bit&~tBit) == 0 && (bit&tBit) != 0) {
					System.out.print(bit + ":");
					for (int j = 0; j < n; j++) {
						if (((bit>>j) & 1) == 1) {
							System.out.print(" " + j);
						}
					}
					System.out.println();
				}
			}
		}
	}
}
