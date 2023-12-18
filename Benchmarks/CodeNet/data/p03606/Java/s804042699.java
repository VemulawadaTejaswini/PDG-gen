import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] lr = new int[n*2];
        
        for(int i=0;i<n*2;i++)
        {
            lr[i] = scan.nextInt();
        }
        
        int i = 0;
        int ans = 0;
        while(i<n*2)
        {
            ans += (lr[i+1]-lr[i])+1;
            i += 2;
        }
        
        System.out.println(ans);
    }
}
