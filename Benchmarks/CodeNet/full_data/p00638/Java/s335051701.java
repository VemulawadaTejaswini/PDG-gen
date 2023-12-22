import java.util.*;

public class Main{

    int n;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    PriorityQueue<int[]> 
		q = new PriorityQueue<int[]>(n,new Comparator<int[]>(){
			public int compare(int[] a, int[] b){
			    return a[1] - b[1];
			}
		    });
	    for(int i=0; i<n; i++){
		q.add(new int[]{sc.nextInt(),sc.nextInt()});
	    }

	    int sum = 0;
	    boolean can = true;
	    while(q.size()>0){
		int[] dd = q.poll();
		sum += dd[0];
		if(sum>dd[1]){
		    can = false;
		    break;
		}
	    }
	    
	    if(can) System.out.println("Yes");
	    else System.out.println("No");
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}