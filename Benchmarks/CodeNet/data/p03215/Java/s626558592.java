import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int N = scan.nextInt();
	    int K = scan.nextInt();

	    int[] lines = new int[N];
	    int[] utu = new int[K];
	    for(int i=0;i<N;i++){
	    	lines[i]=scan.nextInt();
	    }

	    int max=0;
	    int mem=0;
	    for (int i=0;i<N ;i++ ) {
	    	int k=i+1;
	    	while(N-k>=0){
	    		for (int u=i;u<k ;u++ ) {
	    			mem+=lines[u];
	    		}
	    		k++;
	    		if(utu[0]<mem){
	    			utu[0]=mem;
	    			Arrays.sort(utu);
	    		}
	    		mem=0;
	    	}
	    }
	    max=utu[0];
	    for (int i=1;i<K ;i++ ) {
	    	max&=utu[i];
	    }
	    System.out.println(max);
	}
}