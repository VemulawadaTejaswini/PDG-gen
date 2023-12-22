import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int ans, max, n, k;
    boolean[] num;

    void run(){
	while(sc.hasNext()){
	    max = 0;
	    n = sc.nextInt();
	    k = sc.nextInt();
	    if(n!=0){
		num = new boolean[n+1];
		for(int i=0; i<k; i++){
		    int a = sc.nextInt();
		    num[a] = true;
		    if(a > max) max = a;
		}
		ans = 0;
		solve(1, 0, num[0]);
		System.out.println(ans);
	    }
	}
    }
	
    void solve(int level, int sum, boolean use){
	if(level>max || level>=num.length){
	    if(sum > ans) ans = sum;
	    return;
	}
	if(num[level])
	    solve(level+1, sum+1, use);
	else{
	    if(use){
		solve(level+1, sum+1, false);
	    }
	    else{
		if(sum > ans) ans = sum;
		while(level<num.length && !num[level]) level++;
		if(level>=num.length) return;
		solve(level, 0, num[0]);
	    }
	}
    }
}