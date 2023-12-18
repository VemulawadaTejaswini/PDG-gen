import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] x = new int[2 * n];
        int[] y = new int[2 * n];
        int max = 0;
        int max_index = 0;
        int min = 0;
        int min_index = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(max < a[i]){
                max = a[i];
                max_index = i;
            }
            if(min > a[i]){
                min = a[i];
                min_index = i;
            }
        }
        if(Math.abs(min) < max){
            for(int i = 0; i < n; i++){
                y[i] = i + 1;
                x[i] = max_index + 1;
            }
            for(int i = n; i < 2 * n - 1; i++){
                x[i] = i - n + 1;
                y[i] = i - n + 2;
            }
        }
        else{
            for(int i = 0; i < n; i++){
                y[i] = i + 1;
                x[i] = min_index + 1;
            }
            for(int i = n; i < 2 * n - 1; i++){
                x[i] =  2 * n  - i ;
                y[i] = 2 * n - 1 - i;
            }    
        }
        System.out.println(2 * n - 1);
        for(int i = 0; i < 2 * n - 1; i++){
            System.out.println(x[i] + " " + y[i]);
        }
    }
}