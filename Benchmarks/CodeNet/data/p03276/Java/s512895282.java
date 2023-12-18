import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<n-k+1; i++){
            if(Math.abs(x[i]) + Math.abs(x[i+k-1] - x[i]) < min){
                min = Math.abs(x[i]) + Math.abs(x[i+k-1] - x[i]);
            }
            if(Math.abs(x[i+k-1]) + Math.abs(x[i+k-1] - x[i]) < min){
                min = Math.abs(x[i+k-1]) + Math.abs(x[i+k-1] - x[i]);
            }
        }

        System.out.println(min);


    }
}