import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cnt = 0;
		for(int i =0;i<s.length();i++) {
			for(int j=3;j<s.length()-i;j++) {
				String num = "";
				for(int k=i;k<=j+i;k++) {
					num+=s.charAt(k);
				}
				BigInteger bigf = new BigInteger(num);
				BigInteger bigi = new BigInteger("2019");
				BigInteger zero = new BigInteger("0");
				if(bigf.divide(bigi) == zero)cnt++;


			}

		}
		System.out.println(cnt);
	}

}
