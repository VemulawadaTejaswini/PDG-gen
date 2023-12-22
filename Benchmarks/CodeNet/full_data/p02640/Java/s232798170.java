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
    int X;
    int Y;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.X = sc.nextInt();
        this.Y = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "No";
        int crane = 0; //鶴の数
        int turtle = 0;//カメの数
        int total = crane + turtle;
        int total2 = X * 4; //全てカメだった場合の足の本数
        
        if (Y % 2 == 0) {
        	crane = Y -2 * X;
        	turtle = 4 * X - Y;
        	if (crane >= 0 && turtle >= 0) {
        		answer = "Yes";
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
