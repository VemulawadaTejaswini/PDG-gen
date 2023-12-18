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
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.nextInt();
        this.B = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int answer = -1;
        
        for (int i=1; i<=1000; i++) {
        	double a = Math.floor(i*0.08);
        	double b = Math.floor(i*0.1);
        	if (A==a && B==b) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
