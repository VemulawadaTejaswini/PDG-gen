import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sol = "1000000000000000000";
        long sum = 1;
        for(int i=0;i<n;i++){
            long e = sc.nextLong();
            sum=sum*e;
        }
        long sol2 = Long.parseLong(sol);
        if(sol2-sum<0) sum = -1;
        System.out.println(sum);
    }
}