import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	int sum1 = 0;
	double sum2 = 0;
	int cnt = 0;
	while(kbd.hasNext()){
	    String s = kbd.next();
	    String a="";
	    int x, y, i=0;
	    while(!s.substring(i, i+1).equals(",")){
		a += s.substring(i, i+1);
		i++;
	    }
	    x = Integer.parseInt(a);
	    a = "";
	    i++;
	    while(i<s.length()){
		a += s.substring(i, i+1);
		i++;
	    }
	    y = Integer.parseInt(a);

	    sum1 += x*y;
	    sum2 += y;
	    cnt++;
	}

	System.out.println(sum1);
	System.out.printf("%.0f\n", sum2/cnt);
    }
}