import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		String[] ope = {"+","-"};
		int ans = 0;
		
		for(int i = 0; i < 2; i++) {
			String ope1 = ope[i];
			if(ope1.equals("+")) {
				ans = A + B;
			}else {
				ans = A - B;
			}
			for(int j = 0; j < 2; j++) {
				String ope2 = ope[j];
				if(ope2.equals("+")) {
					ans += C;
				}else {
					ans -= C;
				}
				for(int k = 0; k < 2; k++) {
					String ope3 = ope[k];
					if(ope3.equals("+")) {
						ans += D;
					}else {
						ans -= D;
					}
					if(ans == 7) {
						System.out.println(A +ope1+ B +ope2+ C +ope2+ D + "=7");
						System.exit(0);
					}
				}
			}
		}
	}
}