import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, k, m;
    ArrayList<String> stones;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    k = sc.nextInt();
	    m = sc.nextInt();
	    if(n!=0){
		stones = new ArrayList<String>();
		for(int i=0; i<n; i++)
		    stones.add(i, Integer.toString(i+1));
		solve();
	    }
	}
    }

    void solve(){
	int place = (m-1)%n;
	stones.remove(place);
	int count = stones.size();
	while(count>1){
	    place = (place+k-1)%count;
	    if(place<0) place = count-1;
	    stones.remove(place);
	    count = stones.size();
	}
	System.out.println(stones.get(0));
    }
}