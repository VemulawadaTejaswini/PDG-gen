import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[10001];
	setP(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n, p);
	}
    }

    static void solve(int n, boolean[] p){
	int x = n;
	int y = x-2;
	while(!(p[x]&&p[y])){
	    x -= 1;
	    y = x-2;
	}
	System.out.println(y+" "+x);
    }

    static void setP(boolean[] p){
	Arrays.fill(p, true);
	p[0] = p[1] = false;
	int i, j;
	for(i=2; i<p.length; i++){
	    for(j=i+i; j<p.length; j+=i){
		if(p[i]) p[j] = false;
	    }
	}
    }
}