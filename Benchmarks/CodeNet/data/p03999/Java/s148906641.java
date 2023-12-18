import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
    }
    
    //解答処理
    private long solve() {
        long answer = 0;
        long[] total = new long[S.length()];
        int[] num = new int[S.length()];	//加算する値を格納する配列
        char[] s = S.toCharArray();
        
        for (int i = 0; i<S.length(); i++) {	//totalの要素数
        	for (int j=0; j<S.length(); j++) {	//+の探索
        		num[j] = s[j];
        		total[i] += num[j];
        	}
        }
        
        for (int i=0; i<S.length(); i++) {
        	answer += total[i];
        }
        
        return answer;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }
}
