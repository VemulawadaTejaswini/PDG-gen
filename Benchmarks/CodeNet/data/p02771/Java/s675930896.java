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
    int A;
    int B;
    int C;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.nextInt();
        this.B = sc.nextInt();
        this.C = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "No";
        
        if (A==B && B!=C || A==C && B!=C || B==C && C!=A) {
        	answer = "Yes";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
