import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] L = new long[n];
        long sum = 1;
        for(int i=0;i<n;i++){
            L[i]= sc.nextLong();
            if(L[i]==0) sum = 0;
        }
        if(sum!=0) {
            long lim = (long)Math.pow(10,18);
            for(int i=0;i<n;i++){
                long lim2 = (long)Math.ceil(lim/sum);
                if(L[i]>lim2){
                    sum=-1;
                    break;
                }
                else sum*=L[i];
            }
        }
        if(sum!=-1)System.out.println(sum);
        else System.out.println("-1");
    }
}