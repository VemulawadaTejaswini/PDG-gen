import java.util.ArrayList;
import java.util.Collections;
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
    int n;
    int[] a;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.n = sc.nextInt();
        this.a = new int[n];
        for (int i=0; i<n; i++) {
        	a[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private ArrayList<Integer> solve() {
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        for (int i=0; i<n; i++) {
        	b.add(a[i]);
        	Collections.reverse(b);
        }
        
        return b;
    }
    
    //出力
    public void show(ArrayList<Integer> answer) {
        for (int i=0; i<answer.size(); i++) {
        	System.out.print(answer.get(i));
        	System.out.print(" ");
        }
    }

}
