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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.S = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = null;
        
        if (S.substring(S.length()-1, S.length()).equals("s")) {
        	answer = S + "es";
        } else {
        	answer = S + "s";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
