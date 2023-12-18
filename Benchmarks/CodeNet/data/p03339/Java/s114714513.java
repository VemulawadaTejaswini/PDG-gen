import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();
		String S = br.readLine();
		int Nint = Integer.parseInt(N);

		int countW = count(S,"W");

		int result=300000;
		int temp=Nint;
		for (int i = 1;i <= Nint;i++) {
			int Wtemp = count(S.substring(0,i-1),"W"); // 左側でW向いている人
			int Etemp = (Nint -i) - (countW -Wtemp-1); // 右側でE向いている人

			temp = Wtemp + Etemp ; 
			if (temp < result) {
				result = temp;
			}
		}

		System.out.println(result); 
	}

	public static int count(String target, String item) {
		int count = 0;
		for (int i = 0;i < target.length();i++) {
			if (item.equals(String.valueOf(target.charAt(i)))) {
				count++;
			}
		}
		return count;
	}
}
