import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
      
      	int [] A =new int [N+1];
      	for(int i=1;i<N+1;i++){
        	A[i] = sc.nextInt();
        }

      	long X;
        long  AA ;
      	long S;
        S=0;
		for(int i=1;i<N;i++){
          for(int j=i+1;j<N+1;j++){
        	 AA = A[i]*A[j];
             X=AA%(1000000007);
             S=S+X;
             if(S>1000000007000000){
             	S=S%1000000007;
             }
          }
        }
      System.out.println(S);

    }
}
