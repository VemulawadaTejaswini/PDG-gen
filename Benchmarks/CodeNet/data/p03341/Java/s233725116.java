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
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.S = sc.next();
    }
    
    //解答処理
    private int solve() {
    	char[] s = S.toCharArray();
    	int[] e = new int[N];
    	int[] w = new int[N];
        int countE = 0;
        int countW = 0;
        
        for (int i = 0; i < N; i++) {
        	if (s[i] == 'E') {
        		countE++;
        		e[i] += countE;
        		w[i] = countW;
        	} else if (s[i] == 'W') {
        		countW++;
        		e[i] = countE;
        		w[i] += countW;
        	}
        }
        
        int min = e[N-1] - e[0];
        for (int i = 1; i < N; i++) {
        	int tmp = w[i-1] + e[N-1] - e[i];
        	min = Math.min(min, tmp);
        }
        
        return min;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
