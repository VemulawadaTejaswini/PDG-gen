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
    String S;
    String T;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.S = sc.next();
        this.T = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = "";
        for (int i=0; i<N; i++) {
        	answer += String.valueOf(S.charAt(i));
        	answer += String.valueOf(T.charAt(i));
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
