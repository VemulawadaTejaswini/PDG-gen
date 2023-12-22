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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.X = sc.nextInt();
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = false;
        
        if (X >= 30) {
        	judge = true;
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }

}
