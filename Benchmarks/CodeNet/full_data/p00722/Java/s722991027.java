import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[1000000];
	setP(p);
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    int d = kbd.nextInt();
	    int n = kbd.nextInt();
	    if(a!=0) solve(a, d, n, p);
	}
    }

    static void solve(int a, int d, int n, boolean[] p){
	while(n>0){
	    if(p[a]) {
		n--;
		a += d;
	    }
	    else{
		a += d;
	    }
	}
	System.out.println(a-d);
    }

    static void setP(boolean[] p){
	Arrays.fill(p, true);
	p[0]=false; p[1]=false;
	for(int i=2; i<p.length; i++){
	    for(int j=i+i; j<p.length; j+=i){
		if(p[i]) p[j] = false;
	    }
	}
    }
}