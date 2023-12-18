import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer buf = new StringBuffer();
		int[] p = {8635967,8636633,8639273,8616169,8612399,3915979,3915997,3916019,
		           3916021,3916027,3916037,3916039,3916057,3916067,3916079,3916091,
		           3916097,3916153,3916169,3916177,3916183,3916193,3916229,3916271,
		           3916301, 3916303, 3916309 ,3916313, 3916321, 3916327 ,3916343,
		           3916373, 3916387 ,3916391, 3916403 ,3916411 ,3916433, 3916439,
		           3916453 ,3916459, 3916469 ,3916481 ,3916499, 3916529 ,3916543,
		           3916609 ,3916621, 3916631, 3916637 ,3916639, 3916643 ,3916663,
		           3916667};
		int N =sc.nextInt();
		String ans="";
		for(int i = 0;i<N;i++) {
			buf.append(p[i]);
			buf.append(" ");
		}
		ans = buf.toString();
		System.out.println(ans);
		sc.close();
	}
}
