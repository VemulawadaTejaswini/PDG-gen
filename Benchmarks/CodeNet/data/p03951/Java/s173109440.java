import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
    	sc.nextLine();
    	String s=sc.nextLine();
    	String t=sc.nextLine();

    	int NO=Math.max(N, Math.max(s.length(), t.length()));
    	char[] cas = s.toCharArray();
    	char[] cat = t.toCharArray();

    	for(;true;NO++) {
        	boolean flg=true;
        	for(int i=0; i<NO; i++) {
        		if(i<cas.length && NO-cat.length<=i && cas[i]!=cat[i-(NO-cat.length)]) {
        			flg=false;
        			break;
        		}
        	}
        	if(flg) {
        		break;
        	}
    	}
    	System.out.println(NO);
    }
}