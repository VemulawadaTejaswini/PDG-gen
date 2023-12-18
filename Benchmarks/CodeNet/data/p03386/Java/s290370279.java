import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int A=sc.nextInt(),B=sc.nextInt(),K=sc.nextInt(),i=0;
        if(B-A>2*K){
            for(i=0;i<K;i++){
                System.out.println(A);
                A++;
            }
            B-=K;
            for(i=0;i<K;i++){
                B++;
                System.out.println(B);
            }
        }
        else{
            for(i=A;i<=B;i++){
                System.out.println(i);
            }
        }
    }
}
