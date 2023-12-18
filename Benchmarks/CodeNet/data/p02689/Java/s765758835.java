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
    int M;
    int[] H;
    int[] A;
    int[] B;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.M = sc.nextInt();
        this.H = new int[N];
        this.A = new int[N];
        this.B = new int[N];
        for (int i = 0; i < N; i++) {
        	this.H[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
        	this.A[i] = sc.nextInt();
        	this.B[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        int[] m = new int[N];
        
        for (int i = 0; i < M; i++) {
        	m[A[i]-1] = Math.max(m[A[i]-1], H[B[i]-1]);
        	m[B[i]-1] = Math.max(m[B[i]-1], H[A[i]]-1);
        }
        
        for (int i = 0; i < N; i++) {
        	if (m[i] < H[i]) {
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
