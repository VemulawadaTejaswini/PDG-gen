import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),
            min = (int)Math.pow(10, 9)+1;
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        loop: for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                int value = gcd(A[i], A[j]);
                if(value < min){
                    min = value;
                }
                if(min == 1){
                    break loop;
                }
            }
        }
        System.out.println(min);
    }

    public static int gcd(int a, int b){        
        if(b < a){
            int c = a;
            a = b;
            b = c;
        }
        int r;
        while((r = b%a) > 0){
            b = a;
            a = r;
        }
        return a;
    }   
}