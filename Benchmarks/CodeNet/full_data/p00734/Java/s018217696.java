import java.util.*;

public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[]args) {
	while(kbd.hasNext()){
	    int tl = kbd.nextInt();
	    int hl = kbd.nextInt();
	    if(tl!=0 && hl!=0){
		int[] t = new int[tl+1];
		int[] h = new int[hl+1];
		for(int i=1; i<t.length; i++){
		    t[i] = kbd.nextInt();
		    t[0] += t[i];
		}
		for(int i=1; i<h.length; i++) {
		    h[i] = kbd.nextInt();
		    h[0] += h[i];
		}
		solve(t, h);
	    }
	}
    }

    static void solve(int[]t, int[]h) {
	int a, b;
	int c=t[0], d=h[0];
	int x=100, y=100;
	for(a=1; a<t.length; a++){
	    for(b=1; b<h.length; b++){
		c = c-t[a]+h[b];
		d = d-h[b]+t[a];
		if(c==d && x+y>t[a]+h[b]){
		    x = t[a];
		    y = h[b];
		}
		c = t[0];
		d = h[0];
	    }
	}
	if(check(t, h, x, y)) System.out.println(x+" "+y);
	else System.out.println(-1);
    }

    static boolean check(int[] t, int[] h, int x, int y){
	boolean p = t[0]-x+y==h[0]-y+x;
	boolean q = false;
	for(int i=1; i<t.length; i++){
	    for(int j=1; j<h.length; j++){
		if(t[i]==x && h[j]==y) q = true;
	    }
	}
	return q;
    }
}