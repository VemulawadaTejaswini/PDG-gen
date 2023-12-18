import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int po[]=new int[n];
        for(int i=0;i<n;i++){
            po[i]=sc.nextInt()-i-1;
        }
        Arrays.sort(po);
        
        int b=po[n/2];
        long ans=0;
        for(int i=0;i<n;i++)ans+=Math.abs(po[i]-b);
        System.out.println(ans);
    }
}
