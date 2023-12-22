import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        int [] A = new int [N+1];
        for(int i=1; i<N+1; i++){
        	A[i] = sc.nextInt();
        }
        
        int [] L = new int [N+1];
        for(int i=2; i<N+1; i++){
        	if(A[i]<A[i-1]){
            	L[i]=A[i]-A[i-1];
            }
        }
      	
      	int S;
   		S=0;
      	for(int i=2; i<N+1; i++){
        	S=S+L[i];
        }     	
        // 出力
        System.out.println(S);
    }
}
