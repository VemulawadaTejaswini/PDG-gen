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
    int[] A = new int[9];
    int N;
    int[] b;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        for (int i=0; i<3; i++) {
        	A[i] = sc.nextInt();
        }
        N = sc.nextInt();
        b = new int[N];
        for (int i=0; i<N; i++) {
        	b[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = false;
        boolean[] mark = new boolean[9];
        
        for (int i=0; i<N; i++) {
        	for (int j=0; j<9; j++) {
        		if (A[i] == b[i]) {
            		mark[i] = true;
            	}
        	}
        }
        
        if (mark[0] && mark[1] && mark[2]) {
        	judge = true;
        } else if (mark[3] && mark[4] && mark[5]) {
        	judge = true;
        } else if (mark[6] && mark[7] && mark[8]) {
        	judge = true;
        } else if (mark[0] && mark[4] && mark[8]) {
        	judge = true;
        } else if (mark[0] && mark[3] && mark[6]) {
        	judge = true;
        } else if (mark[1] && mark[4] && mark[7]) {
        	judge = true;
        } else if (mark[2] && mark[5] && mark[8]) {
        	judge = true;
        } else if (mark[2] && mark[4] && mark[6]) {
        	judge = true;
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean judge) {
        if (judge) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }

}
