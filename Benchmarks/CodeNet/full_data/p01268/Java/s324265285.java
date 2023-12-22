import java.util.*;

class Main{

    int N,P;
    int[] p;

    void solve(){
	Scanner sc = new Scanner(System.in);

	int MAX = 200600;
	p = new int[MAX];
	for(int i=2; i<p.length; i++)p[i] = 1;
	for(int i=2; i<Math.sqrt(MAX)+1; i++){
	    for(int j=i*2; j<MAX; j+=i){
		p[j] = 0;
	    }
	}

	while(true){
	    N = sc.nextInt();
	    P = sc.nextInt();
	    if(N==-1 && P==-1) break;

	    int[] list = new int[10000];
	    Arrays.fill(list,Integer.MAX_VALUE);
	    int idx = 0;
	    for(int i=N+1; i<N+300; i++){
		if(p[i]==0) continue;
		for(int j=i; j<N+300; j++){
		    if(p[j]==0) continue;
		    list[idx] = i+j;
		    idx++;
		}
	    }

	    Arrays.sort(list);

	    System.out.println(list[P-1]);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}