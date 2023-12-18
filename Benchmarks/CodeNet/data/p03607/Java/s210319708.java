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
    int[] A;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        A = new int[N];
        for (int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
    	int answer = 0;
    	Arrays.sort(A);
        int count = 0;
        int s = A[0];	//基準値
        for (int i=0; i<N; i++) {
        	if (A[i] == s) { //値が存在していたら1増やす
        		count++;
        	} else {
        		s = A[i];
        		if (count%2 == 1) {
        			answer++;
        		}
        		count = 1;
        	}
        }
        if (count%2 == 1) {
        	answer++;
        }
        
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
