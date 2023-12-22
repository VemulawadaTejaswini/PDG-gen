import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, k, m;
    boolean[] stones;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    k = sc.nextInt();
	    m = sc.nextInt();
	    if(n!=0){
		stones = new boolean[n];
		Arrays.fill(stones, true);
		solve();
	    }
	}
    }

    void solve(){
	int place = m%n;
	stones[place] = false;
	int count = n-1;
	while(count>1){
	    int t = k;
	    while(t>0){
		place = (place+1) % n;
		if(stones[place]) t--;
	    }
	    stones[place] = false;
	    count--;
	}
	int i=0;
	while(!stones[i]) i++;
	System.out.println(i==0 ? n:i);
    }
}