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
    int K;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        S = sc.next();
        K = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "";
        String[] str = S.split("");
        
        for (int i=0; i<S.length(); i++) {
        	if (!str[i].equals(String.valueOf(S.charAt(K-1)))) {
        		str[i] = "*";
        	}
        	answer += str[i];
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }
}
