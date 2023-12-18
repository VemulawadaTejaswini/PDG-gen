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
    int R;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.R = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "ABC";
        
        if (1200 <= R && R < 2800) {
        	answer = "ARC";
        } else if (2800 <= R) {
        	answer = "AGC";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
