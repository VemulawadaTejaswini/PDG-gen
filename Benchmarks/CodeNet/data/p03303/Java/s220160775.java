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
    String S;
    int w;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
        w = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = String.valueOf(S.charAt(0));
        
        for (int i=w; i<S.length(); i+=w) {
        	answer += S.charAt(i);
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }
}
