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
    String answer;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
    }
    
    //解答処理
    private String solve() {
        
        if (S.length() == 2) {
        	answer = S;
        } else if(S.length() == 3) {
        	String[] str = S.split("");
        	answer = str[2] + str[1] + str[0] ;
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }
}
