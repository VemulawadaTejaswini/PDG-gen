
import java.util.*;

import static java.lang.System.*;

class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();

    public List<Integer> getPrimeList(int max){
		LinkedList<Integer> primes=new LinkedList<Integer>();

		PLoop:for(int i=2;i<max;i++){
			for(int prime:primes){
				if(i%prime==0){
					continue PLoop;
				}
				if( prime*prime>i){
					break;
				}
			}
			primes.add(i);
		}
		return primes;
	}

    public void run() {
    	while(true){
    		int m=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
    		if(m==0 && a==0 && b==0)return;
    		List<Integer> primes=new ArrayList<Integer>(getPrimeList((int)Math.sqrt(100000)));

    		int max=0,pres=-1,qres=-1;
    		for(int i=0;i<primes.size();i++)
    			for(int j=i;j<primes.size();j++){
    				int p=primes.get(i),q=primes.get(j);
    				if(q*a<=b*p && p*q<=m){
    					if(max<p*q){
    						max=p*q;
    						pres=p;
    						qres=q;
    					}
    				}
    		}

    		ln(pres +" "+qres);
    	}
    }
    public static void main(String[] args) {
        new Main().run();
    }

    public int[] nextIntArray(int n){
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=sc.nextInt();
        }
        return res;
    }
    public static void pr(Object o) {
        out.print(o);
    }
    public static void ln(Object o) {
        out.println(o);
    }
    public static void ln() {
        out.println();
    }
}