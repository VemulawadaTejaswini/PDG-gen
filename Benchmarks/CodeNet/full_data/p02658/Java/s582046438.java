import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] L = new long[n];
        long sum = 1;
        String limit = "1000000000000000000";
        for(int i=0;i<n;i++){
            L[i] = sc.nextLong();
            if(L[i]==0) sum = 0;
        }
        for(int i=0;i<n;i++){
            long lim = Long.parseLong(limit);
            sum*=L[i];
            if(lim-sum<0){
                sum=-1;
                break;
            }
        }
        System.out.println(sum);
    }
}