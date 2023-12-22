import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	int n = kbd.nextInt();
	int q = kbd.nextInt();
	int[] wksg = new int[10000001];
	int maxP = 1;
	int maxW = 0;
	while(q>0){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    wksg[a] += b;
	    q--;
	 
	    if(wksg[a] > maxW){
		maxP = a;
		maxW = wksg[a];
	    }
	    else if(wksg[a]==maxW && a<maxP){
		maxP = a;
		maxW = wksg[a];
	    }
	    System.out.println(maxP+" "+maxW);
	}
    }
}