import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        int ans=0;
        for(int i=0;i<p.length;i++)
        {
            p[i] = scan.nextInt();
        }
        Arrays.sort(p);
        p[n-1]/=2;
        for(int i=0;i<p.length;i++)
        {
            ans+=p[i];
        }
        System.out.println(ans);
        }
}
