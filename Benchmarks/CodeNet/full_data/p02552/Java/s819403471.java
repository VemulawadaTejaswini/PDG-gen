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
    int x;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.x = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
        if(x==0) {
        	answer = 1;
        }
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
