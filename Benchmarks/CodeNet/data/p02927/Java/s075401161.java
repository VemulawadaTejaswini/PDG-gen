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
    int M;
    int D;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        M = sc.nextInt();
        D = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        
        for (int i=1; i<=M; i++) {
        	for (int j=1; j<=D; j++) {
        		int d1 = j % 10;
                int d10 = j / 10;
                int dd = d1 * d10;
        		
        		if (d1 >= 2 && d10 >= 2 && dd == i) {
        			count++;
        		}
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }
}
