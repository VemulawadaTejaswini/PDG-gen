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
    		while (wk.length()>0){
    			int l = wk.length();
    			String c = wk.substring(0,1);
    			wk=wk.replace(c,"");
    			ret++;
    		}
    		return ret;
    	}
} 