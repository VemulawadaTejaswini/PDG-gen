import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] gcd_left = new int[N];
        int[] gcd_right = new int[N];
        gcd_left[0] = A[0];
        gcd_right[N-1] = A[N-1];
        for(int i = 0; i < N-1; i++){
            gcd_left[i+1] = gcd(gcd_left[i],A[i+1]);
            gcd_right[N-2-i] = gcd(gcd_right[N-1-i],A[N-2-i]);
        }
        
        int max_gcd = 1;
        int tmp_left = 0;
        int tmp_right = 0;
        if(N>2){
            if(max_gcd < gcd_right[1]){
                max_gcd = gcd_right[1];}
            if(max_gcd < gcd_left[N-2]){
                max_gcd = gcd_left[N-2];}
            for(int i = 0; i < N-2; i++){
                tmp_left = gcd_left[i];
                tmp_right = gcd_right[i+2];
                int tmp = gcd(tmp_left,tmp_right);
                if(tmp > max_gcd){
                    max_gcd = tmp;}
            }
        } else{
            max_gcd = gcd(A[0],A[1]);
        }
        System.out.println(max_gcd);
        

    }
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}
