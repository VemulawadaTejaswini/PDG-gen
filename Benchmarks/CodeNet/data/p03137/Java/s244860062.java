import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for(int i = 0 ; i < m ; i++ ){
            x[i] = sc.nextInt();
        }
        sc.close();
        if(n >= m){
            System.out.println(0);
        }else{
            Arrays.sort(x);
            int[] y = new int[m - 1];
            for(int i = 0 ; i < m - 1 ; i++ ){
                y[i] = x[i + 1] - x[i];
            }
            Arrays.sort(y);
            for(int i = 1 ; i < m - n; i++ ){
                y[0] += y[i];
            }
            System.out.println(y[0]);
        }
    }
}