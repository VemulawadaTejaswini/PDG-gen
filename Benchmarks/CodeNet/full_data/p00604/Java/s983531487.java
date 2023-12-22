import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0) solve(n);
	}
    }

    static void solve(int n){
	int[] t = new int[n];
	int i;
	for(i=0; i<n; i++)
	    t[i] = kbd.nextInt();

	int pen = 0;
	int ans = 0;
	Arrays.sort(t);

	for(i=0; i<n; i++){
	    ans += pen+t[i];
	    pen += t[i];
	}
	System.out.println(ans);
    }
}