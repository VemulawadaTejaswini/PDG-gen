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
    int D;
    int[] X;
    int [] Y;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.D = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        this.X =new int[N];
        this.Y = new int[N];
        
        for (int i=0; i<N; i++) {
        	X[i] = sc.nextInt();
        	Y[i] = sc.nextInt();
        	double p = Math.pow(X[i], 2);
        	double q = Math.pow(Y[i], 2);
        	double distance = Math.sqrt(p + q);
        	if (distance <= D) {
        		count++;
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
