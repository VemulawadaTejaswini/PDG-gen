
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
    	List<Integer> plist=new ArrayList<Integer>(getPrimeList(1300000));

    	TCase:while(true){
    		int n=sc.nextInt();
    		if(n==0)return;
    		if(plist.contains(n)){
    			ln(0);
    		}else{
    			int ind=Collections.binarySearch(plist,n);

    			ln(plist.get(~ind)-plist.get(~ind-1));
    		}
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