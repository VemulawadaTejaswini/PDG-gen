import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }

        int flag = 0;
        // A[i-1] < A[i] -- 1  A[i-1] > A[i] -- -1
        int n = 1;
        for(int i=1; i<A.length; i++){
            int cmp = A[i-1] < A[i] ? 1 : -1;
            
            if(flag*cmp < 0){
                flag = 0;
                n++;
                continue;
            }
            flag = cmp;
        }
       
        System.out.println(n);

    }
}