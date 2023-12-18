import java.util.*;
public class Main {
	private static int ans[];
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String s = sc.next();
    	int q = sc.nextInt();

    	for (int i=0;i<q;i++) {
    		int a = sc.nextInt();
    		if (a==1) {
    			int b = sc.nextInt();
    			String c = sc.next();
    			s = s.substring(0,b-1)+c+s.substring(b);
    		}else{
    			int d = sc.nextInt();
    			int e = sc.nextInt();
              	String temp=s.substring(d-1,e);
                System.out.println(count(temp));
    		}
    	}
    }
    	private static int count(String s) {
    		String wk = s;
    		int ret = 0;
    			int l = wk.length();
    			if (l-wk.replace("a","").length()>0) ret++;
    			if (l-wk.replace("b","").length()>0) ret++;
    			if (l-wk.replace("c","").length()>0) ret++;
    			if (l-wk.replace("d","").length()>0) ret++;
    			if (l-wk.replace("e","").length()>0) ret++;
    			if (l-wk.replace("f","").length()>0) ret++;
    			if (l-wk.replace("g","").length()>0) ret++;
    			if (l-wk.replace("h","").length()>0) ret++;
    			if (l-wk.replace("i","").length()>0) ret++;
    			if (l-wk.replace("j","").length()>0) ret++;
    			if (l-wk.replace("k","").length()>0) ret++;
    			if (l-wk.replace("l","").length()>0) ret++;
    			if (l-wk.replace("m","").length()>0) ret++;
    			if (l-wk.replace("n","").length()>0) ret++;
    			if (l-wk.replace("o","").length()>0) ret++;
    			if (l-wk.replace("p","").length()>0) ret++;
    			if (l-wk.replace("q","").length()>0) ret++;
    			if (l-wk.replace("r","").length()>0) ret++;
    			if (l-wk.replace("s","").length()>0) ret++;
    			if (l-wk.replace("t","").length()>0) ret++;
    			if (l-wk.replace("u","").length()>0) ret++;
    			if (l-wk.replace("v","").length()>0) ret++;
    			if (l-wk.replace("w","").length()>0) ret++;
    			if (l-wk.replace("x","").length()>0) ret++;
    			if (l-wk.replace("y","").length()>0) ret++;
    			if (l-wk.replace("z","").length()>0) ret++;
    		return ret;
    	}
} 