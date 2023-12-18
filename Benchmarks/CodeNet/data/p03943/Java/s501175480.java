import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int a = Integer.parseInt(ss0[0]);
		int b = Integer.parseInt(ss0[1]);
		int c = Integer.parseInt(ss0[2]);

		if (a+b == c) {  System.out.println("Yes"); return; }
		if (b+c == a) {  System.out.println("Yes"); return; }
		if (c+a == b) {  System.out.println("Yes"); return; }

		System.out.println("No");
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}
