import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int W = Integer.parseInt(ss0[0]);
		int a = Integer.parseInt(ss0[1]);
		int b = Integer.parseInt(ss0[2]);


		if ((a<=b)&&(b<=a+W)) { System.out.println(0); return; }
		if ((a<=b+W)&&(b+W<=a+W)) { System.out.println(0); return; }
		if ((b<=a)&&(a<=b+W)) { System.out.println(0); return; }
		if ((b<=a+W)&&(a+W<=b+W)) { System.out.println(0); return; }

		int x = Math.abs( b-(a+W) );
		int y = Math.abs( a-(b+W) );
		
		x = (x < y) ? x : y;  //Max

        System.out.println(x);
        return;
    }
    //-----------------------------------------------------------------
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }


	//-----------------------------------------------------------------
	// 入力値確認
	static void checkInput(int[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(int[] i1: i2){
			for(int i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}

}