import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sort so = new sort();
		
		int n = 0;
		int p = 0;
		int r = 0;
		
		String AO[];
		String BO[];
		
		int A[];
		int B[];
		
		n = Integer.parseInt(as.next());
		
		AO = new String[n];
		A  = new int[n];
		
		for(int i=0;i<n;i++){
			
			AO[i] = as.next();     //??\?????????????????????????????????????????????COO???????´?
            A[i] = Integer.parseInt(as.next());
			
		}
		
		BO = AO.clone();
		B  = A.clone();
		
		r = n-1;
		so.quicksort(A,AO,p,r);
		
		for(int i=0;i<=n-1;i++){           //0??????N-1?????§??°?????????
            for(int j=n-1;j>=i+1;j--){     //???????????????????????????????????§??°?????????
                 
                if(B[j] < B[j-1]){       //j?????????????´?CB[j]???j???????????????????´?CB[j-1]
                                           //???????°?????????£?????´???
                    int treI = B[j];          //???????????????CBO??¨CB???????????????
                    B[j] = B[j-1];
                    B[j-1] = treI;
                    String treS = BO[j];
                    BO[j] = BO[j-1];
                    BO[j-1] = treS;
                     
                }
                 
            }
             
        }
		
		if(Arrays.equals(AO, BO)){
			
			sb.append("Stable");
			
		}
		else{
			
			sb.append("Not stable");
			
		}
		
		System.out.println(sb);
		
		for(int k=0;k<n;k++){
			
			sb.setLength(0);
			sb.append(String.valueOf(AO[k])).append(" ").append(String.valueOf(A[k]));
			System.out.println(sb);
			
		}
		
	}

}

class sort{
	
	public static int partition(int A[],String AO[],int p,int r){
		
		int x = A[r];
		int i = p-1;
		int j = 0;
		int tre;
		String treO;
		
		for(j=p;j<r;j++){
			
			if(A[j] <= x){
				
				i = i + 1;
				tre = A[i];
				A[i] = A[j];
				A[j] = tre;
				treO = AO[i];
				AO[i] = AO[j];
				AO[j] = treO;
				
			}
			
		}
		
		tre = A[i + 1];
		A[i + 1] = A[r];
		A[r] = tre;
		treO = AO[i+1];
		AO[i+1] = AO[r];
		AO[r] = treO;
		
		return i+1;
		
	}
	
	public static void quicksort(int A[],String AO[],int p,int r){
		
		int q = 0;
		
		if(p < r){
			
			q = partition(A, AO, p, r);
			quicksort(A, AO, p, q-1);
			quicksort(A, AO, q+1, r);
			
		}
		
	}
}