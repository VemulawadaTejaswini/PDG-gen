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
    int[] city = new int[4];
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        for (int i=0; i<3; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	city[a-1]++;
        	city[b-1]++;
        }
    }
    
    //解答処理
    private boolean solve() {
        boolean judge = true;
        
        for (int i=0; i<4; i++) {
        	if (city[i] >= 3) {
        		judge = false;
        		break;
        	}
        }
        
        return judge;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }

}
