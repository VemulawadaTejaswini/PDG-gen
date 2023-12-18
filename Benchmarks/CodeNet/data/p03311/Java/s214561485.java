import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            c[i] = a[i] -(i+1);
        }
        
        Arrays.sort(c);
        int b;
        if(n%2 == 0){
            b = (c[n/2 -1] + c[n/2]) /2;
        }else{
            b = c[n/2];
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.abs(a[i] - (b+i+1));
        }
        
        System.out.println(ans);
    }
}