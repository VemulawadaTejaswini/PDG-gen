import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        
        if(n >= m){
            System.out.println(0);
        }else{
            int[] d = new int[m - 1];
            for(int i = 0 ; i < d.length ; i ++){
                d[i] = x[i + 1] - x[i];
            }
            Arrays.sort(d);
            int res = 0;
            for(int i = 0 ; i < n - m - 1; i ++){
                res = d[i];
            }
            System.out.println(res);
        }
    }
}
