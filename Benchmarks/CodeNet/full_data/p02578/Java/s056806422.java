import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] a = new int[n];
       int[] b = new int[n];
       b[0] = 0;
       int ans = b[0];
       for(int p = 0; p < n; p++){
           int x = sc.nextInt();
           a[p] = x;
       }
       for(int p = 1; p < n; p++){
           if(a[p] >= a[p-1]){
               b[p] = 0;
           }
           else if(a[p] < a[p-1]){

               b[p] = a[p-1] - a[p];
               a[p] = a[p-1];
           }
           ans += b[p];
          
       }
        System.out.println(ans);
    }

}