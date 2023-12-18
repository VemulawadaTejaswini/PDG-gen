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
    int K;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.K = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
        //NをK進数に変換する
        String num = Integer.toString(N, K);
        answer = num.length();
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
