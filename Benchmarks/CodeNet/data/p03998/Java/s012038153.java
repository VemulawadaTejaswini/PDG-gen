import java.util.ArrayDeque;
import java.util.Queue;
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
    Queue<String> A = new ArrayDeque<String>();
    Queue<String> B = new ArrayDeque<String>();
    Queue<String> C = new ArrayDeque<String>();
    char next = 'a';
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = read();
        this.B = read();
        this.C = read();
    }
    
    //キューに値を格納するためのメソッド
    private Queue<String> read() {
    	Queue<String> tmp = new ArrayDeque<String>();
    	String S = sc.next();
    	for (int i=0; i<S.length(); i++) {
    		tmp.add(String.valueOf(S.charAt(i)));
    	}
    	return tmp;
    }
    
    //解答処理
    private String solve() {
        String answer = null;
        
        while (true) {
        	if (next == 'a') {
        		if (A.size() == 0) {
            		answer = "A";
            		break;
            	}
        		play(A);
        	} else if (next == 'b') {
        		if (B.size() == 0) {
            		answer = "B";
            		break;
            	}
        		play(B);
        	} else if (next == 'c') {
        		if (C.size() == 0) {
            		answer = "C";
            		break;
            	}
        		play(C);
        	}
        	  
        }
        
        return answer;
    }
    
    //操作
    private Queue<String> play(Queue<String> tmp) {
    	next = tmp.poll().charAt(0);
    	return tmp;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
