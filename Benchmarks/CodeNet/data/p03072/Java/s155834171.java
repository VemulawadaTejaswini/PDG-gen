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
    int[] H;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        H = new int[N];
        for (int i=0; i<N; i++) {
        	H[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int count = 1; //1番目は確実に見れるので1
        int highest = H[0];
        
        for (int i=1; i<N; i++) {
        	if (H[i] >= highest) {
        		count++;
        		highest = H[i];
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
