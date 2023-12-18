import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K= sc.nextInt();
        
        if((B-A) <= K){
            //System.out.println(A);
            for(int i=0; i<=B-A; i++){
                System.out.println(A+i);
            }
        }else if((B-A+1)/2 >= K){
            for(int i=0; i<K; i++){
                System.out.println(A+i);
            }
            for(int i=K; i>0; i--){
                System.out.println(B-i+1);
            }
        }else if((B-A+1)/2 < K){
            for(int i=0; i<=B-A; i++){
                System.out.println(A+i);
            }
        }
        
        //System.out.println();
    }
}
