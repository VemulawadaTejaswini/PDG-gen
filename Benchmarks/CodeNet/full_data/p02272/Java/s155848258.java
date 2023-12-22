import java.util.*;

public class Main {

	static int cnt = 0;

    public static void main(String[] args) {
        
    	//Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] S = new int[n];
        
        for(int i = 0; i < n; i++){
        	S[i] = sc.nextInt();
        }
        
        //Calculation
        int[] result = new int[S.length];
        result = margeSort(S);
        
        //Output
        print(result);
    }

    private static void print(int[] ar){
    	for(int i = 0; i < ar.length; i++){
        	System.out.print(ar[i]);
        	if(i < ar.length - 1){
        		System.out.print(" ");
        	}
        }
    	System.out.println();
    	System.out.println(cnt);
    }

    private static int[] margeSort(int[] ar){
    	
    	if(ar.length == 1){
    		return ar;
    	}

        int mid = ar.length / 2;
        int[] s_01 = new int[mid],
              s_02 = new int[ar.length - mid];

        for (int i = 0; i < mid; i++) s_01[i] = ar[i];
        for (int i = 0; i < ar.length - mid; i++) s_02[i] = ar[mid + i];
        
        int[] r_01 = margeSort(s_01);
        int[] r_02 = margeSort(s_02);
        return marge(r_01,r_02);
    }

    private static int[] marge(int[] a,int[] b){

    	int j = 0,k = 0;
    	int[] r = new int[a.length + b.length];

    	for (int i = 0; i < r.length; i++,cnt++) {
    		//guard
			if (j == a.length) {
				r[i] = b[k];
				k++;
				continue;
			}
			if (k == b.length) {
				r[i] = a[j];
				j++;
				continue;
			}
			//comparison
			if (a[j] < b[k]) {
				r[i] = a[j];
				j++;
			} else {
				r[i] = b[k];
				k++;
			}
		}
    	return r;
    }
}