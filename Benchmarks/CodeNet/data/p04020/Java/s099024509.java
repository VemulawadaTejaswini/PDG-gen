import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] al = new long[n];
        long left = 0, right = 0;
        for(int i = 0; i < n; i++){
            al[i] = sc.nextLong();
            left += al[i]/2;
            if(i != 0) left += (al[i-1] % 2 + al[i] % 2)/2;
        }
        for(int i = n-1; i >= 0; i--){
            right += al[i]/2;
            if(i != 0) right += (al[i] % 2 + al[i-i] % 2)/2;
        }
        System.out.println(Math.max(left,right));
    }
}
