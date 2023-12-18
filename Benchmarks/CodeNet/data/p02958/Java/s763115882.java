import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] pn = new int[n];
		    for(int i=0; i<n;i++) {
		    	int p = sc.nextInt();
		    	pn[i] = p;
		    }
		    int[] pn_sort = pn;
		    Arrays.sort(pn_sort);
		    int flg = 0;

		    for(int k=0;k<pn.length-1;k++) {
		    	int[] pn_k = pn;
		    	int p_k = pn[k];
		    	for(int j=k+1;j<pn.length;j++) {
		    		pn_k[j] = p_k;
		    		pn_k[k] = pn[j];
		    		for(int i=0;i<pn.length;i++) {
		    			if(pn_k[i] != pn_sort[i]) {
		    				flg = 1;
		    				break;
		    			}
		    		}
		    	}
		    }

		    if(flg == 1) {
		    	System.out.println("NO");
		    }else {
		    	System.out.println("YES");
		    }
		  }
		}
