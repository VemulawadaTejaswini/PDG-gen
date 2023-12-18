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
        String answer = s.replace(",", " ");
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
