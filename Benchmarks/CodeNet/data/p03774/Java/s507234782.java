import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        int[] c = new int[m];
        int[] d = new int[m];
        
        for(int i=0;i<a.length;i++)
        {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        
        for(int i=0;i<c.length;i++)
        {
            c[i] = scan.nextInt();
            d[i] = scan.nextInt();
        }
        
        int min,tmp;
        for(int i=0;i<a.length;i++)
        {
            min = 100001000; tmp = 0;
            for(int j=0;j<c.length;j++)
            {
                if(Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j])<min)
                {
                    min = Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j]);
                    tmp = j+1;
                }
            }
            System.out.println(tmp);
        }
    }
}
