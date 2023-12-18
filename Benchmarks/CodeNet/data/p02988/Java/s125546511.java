import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]po=new int[n];
        for(int i=0;i<n;i++)po[i]=sc.nextInt();
        int ans=0;
        for(int i=2;i<n;i++){
            if((po[i-2]<po[i-1]&&po[i-1]<po[i])||(po[i-2]>po[i-1]&&po[i-1]>po[i]))
            ans++;
        }
        System.out.println(ans);
    }
}
