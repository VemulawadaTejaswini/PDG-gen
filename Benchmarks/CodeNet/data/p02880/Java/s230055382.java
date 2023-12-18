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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
    }
    
    //解答処理
    private String solve() {
        String answer = "No";
        
        if (1 <= N && N <= 9) {
        	answer = "Yes";
        } else if (N % 2 == 0 && 2 <= N && N <= 18) {
        	answer = "Yes";
        } else if (N % 3 == 0 && 3 <= N && N <= 27) {
        	answer = "Yes";
        } else if (N % 4 == 0 && 4 <= N && N <= 36) {
        	answer = "Yes";
        } else if (N % 5 == 0 && 5 <= N && N <= 45) {
        	answer = "Yes";
        } else if (N % 6 == 0 && 6 <= N && N <= 54) {
        	answer = "Yes";
        } else if (N % 7 == 0 && 7 <= N && N <= 63) {
        	answer = "Yes";
        } else if (N % 8 == 0 && 8 <= N && N <= 72) {
        	answer = "Yes";
        } else if (N % 9 == 0 && 9 <= N && N <= 81) {
        	answer = "Yes";
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
