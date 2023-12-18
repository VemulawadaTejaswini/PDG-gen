import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目数字、2行目文字
		String s = br.readLine();
		
		int i = s.indexOf("A");
		int j = s.lastIndexOf("Z");


        //System.out.println(i);
        //System.out.println(j);
        System.out.println(j - i + 1);
        return;
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}