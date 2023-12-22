import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    int[][] seigen = new int[n][2];
	    for(int i=0; i<n; i++){
		seigen[i][0] = sc.nextInt();
		seigen[i][1] = sc.nextInt();
	    }

	    Arrays.sort(seigen, new Comparator<int[]>(){
		    public int compare(int[] a, int[] b){
			return a[1] - b[1];
		    }
		});

	    int now = 0;
	    boolean boo = true;
	    for(int i=0; i<n; i++){
		if(seigen[i][1]>=now && seigen[i][1]>=seigen[i][0]+now) now += seigen[i][0];
		else{
		    boo = false;
		    break;
		}
	    }
	    if(boo) System.out.println("Yes");
	    else System.out.println("No");
	}

    }

    public  static void main(String[] args){
	new Main().solve();
    }
}