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

	// テ、ツスツソテ」ツつ湘」ツ?堙」ツ?ォテヲツャツ。テ」ツ?ク
	solve(n, level-1);

	// テ、ツスツソテ」ツ?」テ」ツ?ヲテ」ツ?凝」ツつ嘉」ツ??」ツつづ」ツ??、ツクツ?ヲツ楪?orテヲツャツ。テ」ツ?ク
	n -= coins[level];
	if(n==0) {
	    pattern++;
	    return;
	}
	if(n>=coins[level]) solve(n, level);
	else solve(n, level-1);
    }
}