import java.util.ArrayList;
import java.util.List;
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
        List<Integer> paper = new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
        	if (paper.contains(A[i])) {
        		paper.remove(paper.indexOf(A[i]));
        	} else {
        		paper.add(A[i]);
        	}
        }
        answer = paper.size();
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
