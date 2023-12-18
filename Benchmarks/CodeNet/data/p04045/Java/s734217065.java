import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        //sc.nextLine();
        int D[] = new int[K];
        
        for(int i=0 ; i< K ; i++){
            D[i] = sc.nextInt();
            
        }
   
    int A[] = new int[10-D.length];
    int j=0;
    int k=0;
    int ak=0;
    for(int i=0 ; i< 10 ; i++){
         if(D[k] != i){
                A[ak] = i;
                if(ak<A.length-1){
                ak++;
                }
            }else{
                if(k<K-1){
                    k++;
                }
            }
        }
    String Nl =  Integer.toString(N);
    for(int i=0 ; i< A.length;i++){
             Nl = Nl.replace(Integer.toString(i),Integer.toString(A[i]));
       
    }
    System.out.println(Nl); 
    
    }
}
