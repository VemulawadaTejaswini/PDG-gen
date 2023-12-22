import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] coins = new int[18]; // do not use [0].
    int pattern;

    void run(){
	for(int i=0; i<coins.length; i++)
	    coins[i] = i*i;

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n!=0){
		int level = coins.length-1;
	        pattern = 0;
		while(coins[level]>n) level--;
		solve(n, level);
		System.out.println(pattern);
	    }
	}
    }

    void solve(int n, int level){
	//System.out.println("*"+n+" "+level);
	if(level==0) return;	

	// 使わずに次へ
	solve(n, level-1);

	// 使ってから、もう一枚!or次へ
	n -= coins[level];
	if(n==0) {
	    pattern++;
	    return;
	}
	if(n>=coins[level]) solve(n, level);
	else solve(n, level-1);
    }
}