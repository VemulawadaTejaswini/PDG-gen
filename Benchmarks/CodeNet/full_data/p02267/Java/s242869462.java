import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);
		
		String line2 = sc.nextLine();
		String[] kari2 = line2.split(" ");
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = Integer.parseInt(kari2[i]);
		}
		
		String line3 = sc.nextLine();
		int q = Integer.parseInt(line3);
		
		String line4 = sc.nextLine();
		String[] kari4 = line4.split(" ");
		int[] T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = Integer.parseInt(kari4[i]);
		}
		
		int C = 0;
		
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (T[i] == S[j]) {
					C++;
					break;
				}
			}
			
		}
		
		System.out.println(C);

	}

}