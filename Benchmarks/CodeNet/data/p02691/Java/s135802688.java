import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int heights[] = new int[N];
		int ptncnt = 0;
		
		for (int i = 0; i < N; i++) {
			heights[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				int hSum = heights[i] + heights[j];
				int nDf = i - j;
				if (hSum == nDf) ptncnt++;
			}
		}
		
		// 出力
		System.out.println(ptncnt);
	}
}

// String str1 = sc.next();　// Stringで取得
// int int1 = sc.nextInt();　// intで取得
// BigDecimal bd1 = sc.nextBigDecimal();　// BigDecimalで取得
// byte byte1 = sc.nextByte();　// byteで取得
// 
// 区切り文字　－＞　タブ、スペース、改行