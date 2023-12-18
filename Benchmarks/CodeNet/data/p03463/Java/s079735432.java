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
    int N;
    int A;
    int B;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.A = sc.nextInt();
        this.B = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = null;
        
        if ((B-A) % 2 == 0) {
        	answer = "Alice";
        } else {
        	answer = "Borys";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
