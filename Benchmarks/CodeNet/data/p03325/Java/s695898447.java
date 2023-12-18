import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        int count = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextLong();
        }
        for(int i=0; i<N; i++){
            while(a[i]%2==0){
                a[i]/=2;
                count++;
            }
        }
        System.out.println(count);
    }
}
