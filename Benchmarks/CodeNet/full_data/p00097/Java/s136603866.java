import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, s;
    int ans;
    int max;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    s = sc.nextInt();
	    if(n!=0){
		ans = 0;
		max = 0;
		for(int i=0; i<n; i++)
		    max += 100-i;
		//System.out.println("*"+max);
		solve(100, 0, 0);
		System.out.println(ans);
	    }
	}
    }

    void solve(int level, int sum, int use){
	if(use==n-1){
	    if(s-sum>=0 && s-sum<=level) ans++;
	    return;
	}
	if(s>max || level<0 || use>n || sum>s) return;

	solve(level-1, sum+level, use+1);
	solve(level-1, sum, use);
    }
}