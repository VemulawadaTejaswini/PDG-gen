import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int m;
    int a, b;
    boolean[] prime;

    void run(){
	prime = new boolean[100000];
	setP();
	while(sc.hasNext()){
	    m = sc.nextInt();
	    a = sc.nextInt();
	    b = sc.nextInt();
	    if(m!=0) solve();
	}
    }

    void solve(){
	int p, q, r;
	int ansP=0, ansQ=0, z=ansP*ansQ;
	double x, y;
	x = (double)a/b;

	for(q=m; q>1; q--){
	    if(prime[q])
		for(p=q; p>1; p--){
		    if(prime[p]){
			y = (double)p/q;
			r = p*q;
			if(r>=z && r<=m && x<=y && y<=1){
			    ansP = p;
			    ansQ = q;
			    z = ansP*ansQ;
			}
		    }
		}
	}
	System.out.println(ansP+" "+ansQ);
    }
    
    void setP(){
	Arrays.fill(prime, true);
	prime[0] = prime[1] = false;
	for(int i=2; i<prime.length; i++)
	    if(prime[i])
		for(int k=i+i; k<prime.length; k+=i)
		    prime[k] = false;
    }
}