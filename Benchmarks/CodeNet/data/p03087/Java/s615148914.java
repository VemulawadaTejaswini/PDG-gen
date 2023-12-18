import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int q = Integer.parseInt(temp[1]);

		String s = scanner.nextLine();
		int[] ans = new int[n];

		for(int i = 0; i < n; i++) {
			String cha = String.valueOf(s.charAt(i));
			if(cha.equals("A")) {
				cha = String.valueOf(s.charAt(i + 1));
				if(cha.equals("C")) {
					ans[i]++;
					i++;
				}
			}
		}
		for(int i = 0; i < q; i++) {

			String[] tmp = scanner.nextLine().split(" ");
			int a = Integer.parseInt(tmp[0]) - 1;
			int z = Integer.parseInt(tmp[1]) - 1;
			int t = 0;

			for(int j = a; j < z; j++) {
				if(ans[j] == 1) {
					t++;
				}

			}
			System.out.println(t);
		}
	}
}