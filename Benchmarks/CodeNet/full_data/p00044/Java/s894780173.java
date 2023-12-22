import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[1000000];
	setP(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    solve(n, p);
	}
    }

    static void solve(int n, boolean[] p){
	int i=n-1, j=n+1;
	while(!p[i]) i--;
	while(!p[j]) j++;
	System.out.println(i+" "+j);
    }

    static void setP(boolean[] p){
	Arrays.fill(p, true);
	int i, j;
	p[0] = false;
	p[1] = false;
	for(i=2; i<p.length; i++){
	    for(j=i+i; j<p.length; j+=i){
		if(p[i]) p[j] = false;
	    }
	}
    }
}