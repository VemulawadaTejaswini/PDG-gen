//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int x = Integer.parseInt(ss0[1]);

		do {

			if (N == x) {
				for(int i = 1; i<=(N*2-1); i++){ System.out.println(i); }
				break;
			}

			if( N >= 3){
				if( (N-1)==x ){
					System.out.println(N+1);
					for(int i = 1; i<=(N*2-1); i++){ 
						if (i != (N+1)) {System.out.println(i); }
					}
					break;
				}
				if( (N+1)==x ){
					System.out.println(N-1);
					for(int i = 1; i<=(N*2-1); i++){ 
						if (i != (N-1)) {System.out.println(i); }
					}
					break;
				}
			}

			System.out.println("No");
		} while (false);

    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}