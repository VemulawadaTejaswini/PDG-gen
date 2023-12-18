import java.util.*;
public class Main {
    
    static int[] a = null;
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int NOC = sc.nextInt();
        int n = NOC*2; 
        a = new int[n];
        int i = 0; int sum = 0;
        while(n-->0) a[i++] = sc.nextInt();
        Arrays.sort(a);
        for(i=0; i<a.length; i+=2) sum+=a[i];
        System.out.println(sum);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}