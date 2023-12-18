import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M+2];
        for(int i = 0; i < M+2; i++){
            if(i == 0){
                a[i] = 0;
                continue;
            } 
            if(i == M+1){
                a[i] = N;
                continue;
            }
            a[i] = sc.nextInt();
        }
        long count = 1;
        int index = 1;
        while (index <= M+1){
            if(index > 1 && index != M+1) {
                if((a[index]-a[index-1]) == 1) {
                    count = 0;
                    break;
                }
            }
            if(index == 1 || index == M+1) {
                count *= (stairs(a[index]-a[index-1]-1) % 1000000007);
            }else {
                count *= (stairs(a[index]-a[index-1]-2) % 1000000007);
            }
            index++;
        }
        System.out.println((count % 1000000007));
        sc.close();
    }

    static long kaijou(int n) {
        if(n == 0)
            return 1;
        long kaijou = 1;
        for(int i = 1; i <= n; i++)
            kaijou *= i;
        return kaijou;
    }

    static long stairs(int N) {
        long stairs = 0;
        for(int i = 0; i <= (N/2); i++)
            stairs += ( kaijou(N-i) / (kaijou(i) * kaijou(N-2*i)));
        return stairs;
    }
}