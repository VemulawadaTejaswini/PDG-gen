import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int Q = scanner.nextInt();
        int [] A = new int [N];
        int [] B = new int [Q];
        
        for(int i =0; i<A.length; i++){
            A[i] = K;
        }
        
        for (int j=0; j<B.length; j++){
            B[j] = scanner.nextInt()-1;
        }
        
        int k =0;
        while(k<B.length){
            if(B[k] == k){
                k++;
                continue;
            }
            else{
                A[k] = A[k]-1;
                k++;
            }
        }
           
        for (int l=0; l<A.length; l++){
            if(A[l]>0){
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
            }
        }
    }    
}