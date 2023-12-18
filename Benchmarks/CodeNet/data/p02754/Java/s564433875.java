import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] x = new int[A+B];
        
        for(int i = 0; i < A; i++){
            x[i] = 1;
        }
        for(int j = A; j < A+B; j++){
            x[j] = 0;
        }
        int a = 0;
        int b = 0;
        int k = 0;
        while(a < N){
            if(k == A+B){
                k = 0;
            }
            b = b + x[k];
            k++;
            a++;
        }
        System.out.println(b);
    }
}