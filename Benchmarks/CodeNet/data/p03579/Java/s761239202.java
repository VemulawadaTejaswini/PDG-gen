import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        String[] a = s.split(",", 0);
		// 整数の入力
		int n = Integer.parseInt(a[0]);
		// スペース区切りの整数の入力
		int m = Integer.parseInt(a[1]);
		
		// 出力
		System.out.println(n*(n-3)/2+n-m);
	}
}