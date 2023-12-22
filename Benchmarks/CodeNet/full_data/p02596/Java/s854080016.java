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
    int K;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.K = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
        int num = 7;
        int num2 = 10;
        
        for (int i=1;; i++) {
        	if (K%2 == 0) {
        		break;
        	} else if (!(num%K==0)) {
        		num = num + num2*7;
        		num2 *= 10;
        	} else {
        		answer = i;
        		break;
        	}
        }
        if (answer == 0) {
        	answer = -1;
        }
        
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
