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
    int A;	//すぬけ
    int B;	//ふぬけ
    int C;
    int D;
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.A = sc.nextInt();
        this.B = sc.nextInt();
        this.C = sc.nextInt();
        this.D = sc.nextInt();
        this.S = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = "Yes";
        char[] s = S.toCharArray();
        
        if (s[C-1] == '#' || s[D-1] == '#') {
        	//マスCとマスDどちらかに岩があったらNo
        	answer = "No";
        	return answer;
        }
        
        if (C < D) {
        	for (int i = A-1; i < C-1; i++) {
        		//2連続岩ならNo
        		if (s[i] == '#' && s[i-1] == '#') {
        			answer = "No";
        			return answer;
        		}
        	}
        } else {
        	String tmp = S.substring(B-1,D);
        	//3連続空きが無ければNo
        	if (!tmp.contains("...")) {
        		answer = "No";
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
