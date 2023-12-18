import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        long[] a = new long[n];
        long total = 0;
        int flag = 0;
        long test[] = new long[n];
        int count = 0;
        for(int i = 1;i<=n;i++){
            a[i-1] = sc.nextInt();
            if(a[i-1]-i >= 0){
                total += a[i-1]-i;
                flag += a[i-1]-i;
            }else{
                total -= a[i-1]-i;
                flag += a[i-1]-i;
                count++;
            }
        }
        while(flag >n){
            total -= n-count;
        }
        System.out.println(total);
    }
}