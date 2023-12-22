/*
  整数nが与えられるので、
  二つの素数の和がnになるような組み合わせの数を出力する
 */
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] p = new boolean[35000];
	setP(p);
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n, p);
	}
    }

    static void solve(int n, boolean[] p){
	int i;
	int cnt = 0;
	for(i=2; i<=n/2; i++){
	    if(p[i] && p[n-i]) cnt++;
	}
	System.out.println(cnt);
    }

    static void setP(boolean[] p){
	Arrays.fill(p, true);
	p[0] = false; p[1] = false;
	for(int i=2; i<p.length; i++){
	    for(int j=i+i; j<p.length; j+=i){
		p[j] = false;
	    }
	}
    }
}