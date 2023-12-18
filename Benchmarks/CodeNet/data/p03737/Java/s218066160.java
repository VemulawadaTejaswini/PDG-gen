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
    String s1;
    String s2;
    String s3;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.s1 = sc.next();
        this.s2 = sc.next();
        this.s3 = sc.next();
    }
    
    //解答処理
    private String solve() {
    	char S1 = s1.toUpperCase().charAt(0);
    	char S2 = s2.toUpperCase().charAt(0);
    	char S3 = s3.toUpperCase().charAt(0);
        String answer = String.valueOf(S1) + String.valueOf(S2) + String.valueOf(S3);
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
