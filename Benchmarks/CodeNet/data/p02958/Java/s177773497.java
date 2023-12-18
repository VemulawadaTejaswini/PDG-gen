import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] pn = new int[n];
		    int[] pn_noSort = new int[n];
		    for(int i=0; i<n;i++) {
		    	int p = sc.nextInt();
		    	pn[i] = p;
		    	pn_noSort[i] = p;
		    }


		    Arrays.sort(pn);
		    int flg = 0;

		    for(int i=0;i<n;i++) {
    			if(pn_noSort[i] != pn[i]) {
    				flg = 1;
    				break;
    			}
    			System.out.println("YES");
    		}


		    for(int k=0;k<n-1;k++) {
		    	int[] pn_k = new int[n];
		    	int p_k = pn_noSort[k];
		    	for(int j=k+1;j<n;j++) {
		    		for(int l=0; l<n;l++) {
			    		pn_k[l] = pn_noSort[l];
			    	}
		    		pn_k[j] = p_k;
		    		pn_k[k] = pn_noSort[j];
		    		for(int i=0;i<n;i++) {
		    			if(pn_k[i] != pn[i]) {
		    				flg = 1;
		    				break;
		    			}
		    			flg = 0;
		    		}
		    		if(flg==0) {
		    			break;
		    		}
		    	}
		    	if(flg==0) {
		    		break;
		    	}
		    }
		    if(flg == 1) {
		    	System.out.println("NO");
		    }else {
		    	System.out.println("YES");
		    }
		  }
		}
