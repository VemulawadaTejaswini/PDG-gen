import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
            if(min > x[i]) min = x[i];
            if(max < x[i]) max = x[i];
        }
        int out = Integer.MAX_VALUE;
        for(int i = min; i <= max; i++){
            int t = 0;
            for(int j = 0; j < n; j++){
                if(t < Math.abs(x[j] - i)) t = Math.abs(x[j] - i);
            }
            if(out > t) out = t;
        }
        System.out.println(out);
        scan.close();
    }
}
