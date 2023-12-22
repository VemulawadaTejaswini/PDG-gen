import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long amin = (long)2e9;
        long amax = (long)-2e9;
        long bmin = (long)2e9;
        long bmax = (long)-2e9;
        for(int i=0; i<n; i++){
            long x = Integer.parseInt(sc.next());
            long y = Integer.parseInt(sc.next());
            amin = Math.min(amin, x+y);
            amax = Math.max(amax, x+y);
            bmin = Math.min(bmin, x-y);
            bmax = Math.max(bmax, x-y);
        }
        
        System.out.println(Math.max(amax-amin, bmax-bmin));
    }
    
}