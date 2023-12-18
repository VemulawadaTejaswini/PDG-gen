import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[200100];
        
        for(int i=0;i<a.length;i++)
        {
            a[i] = scan.nextInt();
        }
        
        HaveNumbers(a,b);
        
        Arrays.sort(b);
        
        int ans = 0;
        for(int i=0;i<(b.length-k);i++)
        {
            ans += b[i];
        }
        System.out.println(ans);
    
    }
    static void HaveNumbers(int[] a,int[] b){
        for(int i=0;i<a.length;i++)
        {
            b[a[i]-1]++;
        }
    }
}
