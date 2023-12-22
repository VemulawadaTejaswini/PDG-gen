import java.util.*;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int intN = sc.nextInt();
        long A[] = new long[intN];
        long ans =1;
        for(int i=0; i<intN; i++){
            A[i] = sc.nextLong();
            if(A[i]==0){
                ans=0;
            }
        }
        for(int i=0; i<intN; i++){
            if(ans * A[i] >= Math.pow(10,18) || ans * A[i] <0){
              ans=-1;
              break;
            }else{
              ans *= A[i];
            }        
        }
        
        System.out.println(ans);
    }
}