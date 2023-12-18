import java.util.Scanner;
public class main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int L = s.length();
		String[] Num = s.split("");
		int[] num = new int[L];
		int min = 999;
		for(int i = 0; i < L; i++) {
			num[i] = Integer.parseInt(Num[i]);
		}
		for(int i = 0; i <= L-3; i++) {
			int sft = num[i]*100 + num[i+1]*10 + num[i+2];
			int dif = Math.abs(sft-753);
			min = Math.min(min, dif);
		}
		System.out.println(min);
		sc.close();
	}
}
