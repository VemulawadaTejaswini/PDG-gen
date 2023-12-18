import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    String s;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.s = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = null;
        String[] S = s.split("");
        int A = Integer.valueOf(S[0]);
        int B = Integer.valueOf(S[1]);
        int C = Integer.valueOf(S[2]);
        int D = Integer.valueOf(S[3]);
        
        if (A + B + C + D == 7) {
        	answer = A + "+" + B + "+" + C + "+" + D + "=7";
        } else if (A + B + C - D == 7) {
        	answer = A + "+" + B + "+" + C + "-" + D + "=7";
        } else if (A + B - C + D == 7) {
        	answer = A + "+" + B + "-" + C + "+" + D + "=7";
        } else if (A - B + C + D == 7) {
        	answer = A + "-" + B + "+" + C + "+" + D + "=7";
        } else if (A - B - C + D == 7) {
        	answer = A + "-" + B + "-" + C + "+" + D + "=7";
        } else if (A + B - C - D == 7) {
        	answer = A + "+" + B + "-" + C + "-" + D + "=7";
        } else if (A - B + C - D == 7) {
        	answer = A + "-" + B + "+" + C + "-" + D + "=7";
        } else if (A - B - C - D == 7) {
        	answer = A + "-" + B + "-" + C + "-" + D + "=7";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
