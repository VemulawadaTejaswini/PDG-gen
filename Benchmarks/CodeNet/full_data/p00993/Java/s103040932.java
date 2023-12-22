import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] divisor;
    boolean solved;

    void run(){
	divisor = new int[100000];
	setDivisor();
	while(sc.hasNext()){
	    int n = sc.nextInt();
	    solved = false;
	    for(int i=1; i<divisor.length; i++){
		if(solved) break;
		solve(n, i);
	    } 
	}
    }

    // ans をスタートの数として、後ろを調べて、有効なら改めて表示
    void solve(int n, int ans){
	for(int i=ans; i<ans+n; i++){
	    if(divisor[i]==1) return;
	}
	System.out.println(ans);
	for(int i=ans; i<ans+n; i++){
	    System.out.println(divisor[i]);
	}
	solved = true;
    }

    void setDivisor(){
	Arrays.fill(divisor, 1);
	for(int i=2; i<divisor.length; i++)
	    if(divisor[i]==1)
		for(int j=i+i; j<divisor.length; j+=i)
		    divisor[j] = i;
    }
}