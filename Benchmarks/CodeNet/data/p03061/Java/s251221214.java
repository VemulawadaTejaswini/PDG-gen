import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int[] b = new int[n];
        int[] c = new int[n];
        b[0] = a[0];
        c[n-1] = a[n-1];
        for(int i=0; i<n-1; i++){
            b[i+1] = gcd(b[i], a[i+1]);
            c[n-2-i] = gcd(c[n-1-i], a[n-2-i]);
        }
        
        int max = Math.max(c[1], b[n-1]);
        for(int i=0; i<n-2; i++){
            int tmp = gcd(b[i], c[i+2]);
            max = Math.max(tmp, max);
        }
        
        System.out.println(max);
        
    }
    
    public static int gcd(int a,int b){
        return b>0?gcd(b,a%b):a;
    }
}
