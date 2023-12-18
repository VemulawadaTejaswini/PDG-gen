import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(ans);
    }
}
