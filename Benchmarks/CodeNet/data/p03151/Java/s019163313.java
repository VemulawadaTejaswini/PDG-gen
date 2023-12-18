import java.util.*;
 
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] A = new int[N];
      	int[] B = new int[N];
        int Asum = 0;
        int Bsum = 0;
        int difsum = 0;
        int cnt = 0;
        for(int i=0;i<N;i++){
        	A[i] = sc.nextInt();
            Asum += A[i];
        }
      	for(int i=0;i<N;i++){
        	B[i] = sc.nextInt();
          	Bsum += B[i];
        }
      
      	if(Asum < Bsum){
        	System.out.println(-1);
        }else{
          	ArrayList<Integer> bigger = new ArrayList<Integer>();
        	for(int j=0;j<N;j++){
            	if(A[j]-B[j] <0){
                	difsum += A[j]-B[j];
                    cnt++;
                }else if(A[j]-B[j] > 0){
                 	bigger.add(A[j]-B[j]);
                }
            }
          	int big[] = bigger.stream().mapToInt(i->i).toArray();
          	int temp;
        	for(int k = 0; k < big.length; k++){
            	for(int l = 0; l< big.length -k-1; l++){
                	if(big[l] > big[l + 1]){
                    	temp = big[l];
                    	big[l] = big[l + 1];
                    	big[l + 1] = temp;
                	}
            	}
        	}
            int m =0;
          	while(difsum < 0){
            	difsum += big[m];
              	m++;
                cnt++;
            }
        }
     System.out.println(cnt);    	
     } 
}  