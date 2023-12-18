import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0; i<K; i++) {
            if(i%2==0) {
                if(A%2==0) {
                    A/=2;
                    B+=A;
                }else {
                    A = (A-1)/2;
                    B += A;
                }
            }else {
                if(B%2==0){
                    B/=2;
                    A+=B;
                }else {
                    B=(B-1)/2;
                    A+=B;
                }
            }
        }
        System.out.println(A+" "+B);
    }
}