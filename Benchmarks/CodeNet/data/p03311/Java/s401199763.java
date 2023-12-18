import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int po[]=new int[n];
        int po2[]=new int[n];
        for(int i=0;i<n;i++){
            po[i]=sc.nextInt();
            po2[i]=po[i]-i;
        }
        Arrays.sort(po2);
        int b=po2[n/2];
        int ans=0;
        for(int i=0;i<n;i++)ans+=Math.abs(po2[i]-b);
        if(n%2==0){
            int ans2=0;
            b=po2[n/2-1];
            for(int i=0;i<n;i++)ans2+=Math.abs(po2[i]-b);
            
        System.out.println(Math.min(ans,ans2));
        }
        else 
        System.out.println(ans);
    }
}
