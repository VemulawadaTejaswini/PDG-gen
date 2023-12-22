import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	boolean[] x = new boolean[1001];
	int[] y = new int[1001];
	int term = 0, i=0;
	String a, b="";

	while(kbd.hasNext()){
	    String s = kbd.next();
	    if(s.equals("")){
		term = 1;
	    }
	    else{
		while(!s.substring(i, i+1).equals(",")){
		    a = s.substring(i, i+1);
		    b += a;
		    i++;
		}
		int p = Integer.parseInt(b);
		b = "";
		if(term==0){
		    x[p] = true;
		    y[p] ++;
		}
		else{
		    x[p] = x[p]&&true;
		    y[p] ++;
		}
		i=0;
	    }
	}

	for(i=0; i<x.length; i++){
	    if(x[i] && y[i]>1)
		System.out.println(i+" "+y[i]);
	}
    }
}