import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long X = sc.nextInt();
        // スペース区切りの整数の入力
        long K = sc.nextInt();
        long D = sc.nextInt();
 
      　long [] Y=new long [K+1];
      　long [] A=new long [K+1];
        long Z;
      
		for(long i=1;i<K+1;K++){
        	Y[i]=X+i*D-(K-i)*D;
            A[i]=Math.abs(Y[i]);
        	Y[i-1]=X+(i-1)*D-(K-(i-1))*D;
            A[i-1]=Math.abs(Y[i-1]);
            
            if(A[i]<A[i-1]){
            	Z=A[i];
            }
        }      
      
        // 出力
        System.out.println(Z);
    }
}