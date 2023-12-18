import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[T];
        for(int i=0;i<T;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int sum = K - a[T-1];
        int ans = 0;
        if(sum<a[T-1]-1){
            ans = a[T-1]-1-sum;
        }
        System.out.println(ans);
    }
}
