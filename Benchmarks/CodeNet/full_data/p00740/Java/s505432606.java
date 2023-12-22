import java.util.*;

public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	while(kbd.hasNext()){
	    int ml = kbd.nextInt();
	    int bowl = kbd.nextInt();
	    if(ml!=0 && bowl!=0){
		int[] m = new int[ml];
		solve(bowl, m);
	    }
	}
    }

    static void solve(int bowl, int[] m){
	int t = 0;
	for(int i=1; i<=1000000; i++){
	    if(check(bowl, m)) break;
	    else if(bowl==0){
		bowl = m[t];
		m[t] = 0;
		t = (t+1)%m.length;
	    }
	    else {
		bowl -= 1;
		m[t] +=1;
		t = (t+1)%m.length;
	    }
	}
	for(t=0; m[t]==0; t++);
	System.out.println(t);
    }

    static boolean check(int bowl, int[] m) {
	int c = 0;
	for(int i=0; i<m.length; i++){
	    if(m[i]>0) c++;
	}
	if(bowl==0 && c==1) return true;
	return false;
    }
}