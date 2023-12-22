import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),ans=0;
        for(int i=1;i<n;i++)
            for(int j=1;i*j<n;j++)
                ans++;
        System.out.println(ans);
    }
}