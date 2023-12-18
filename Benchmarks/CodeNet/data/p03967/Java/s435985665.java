import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	//初期化読み込み
    	Scanner sc = new Scanner(System.in);
    	String s=sc.next();
    	StringBuilder sb = new StringBuilder();
    	int countG=0;
    	int countP=0;
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i)=='g'){
    			countG++;
    		}else{
    			countP++;
    		}
    	}
    	int P = countG-countP;
    	System.out.println(P/2);
    }
}