import java.util.Arrays;
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
    int[] H;    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.K = sc.nextInt();
        H = new int[N];
        for (int i=0; i<N; i++) {
        	H[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private long solve() {
        long count = 0;
        Arrays.sort(H);
        
        for (int i=0; i<N-K; i++) {
        	count += H[i];
        }
        
        return count;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
