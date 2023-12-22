import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int max=0;


        if( K < A){
            max = K;
            K=0;
        }else{
            for(int i=0; i<A; i++){
                max++;
                K--;
            }
        }
        if(K > 0){
            K-=B;
        }
        if(K > 0){
            while(K > 0){
                K--;
                max--;
            }
        }
        A=C-1;

        System.out.println(max);

        sc.close();
    }
    
}