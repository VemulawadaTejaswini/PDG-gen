import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int x = scan.nextInt();
        
        int[] city = new int[n+1];
        city[0] = x;
        for(int i=1;i<city.length;i++)
        {
            city[i] = scan.nextInt();
        }
        
        Arrays.sort(city);
        
        int[] bwc = new int[n];
        for(int i=0;i<bwc.length;i++)
        {
            bwc[i] = city[i+1] - city[i];
        }
        
        int ans = 0;
        if(n==1)
        {
            ans = bwc[0];
        }
        else
        {
            ans = ArrayGcd(bwc);
        }
        
        System.out.println(ans);
    }
    
    
    static int gcd(int a,int b){
        if(b==0)
        {
            return a;
        }
        int r = a % b;
        
        return gcd(b,r);
    }
    
    static int ArrayGcd(int[] p){
        int a = gcd(p[0],p[1]);
        int i = 2;
        while(i<p.length)
        {
            a = gcd(a,p[i]);
            i++;
        }
        return a;
    }
}