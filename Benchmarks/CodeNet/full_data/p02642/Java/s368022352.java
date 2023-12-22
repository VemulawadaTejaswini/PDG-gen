import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int ans=0;
        int p[]=new int[1000001];
        int a[]=new int[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
            for(int j=1; a[i]*j<1000001; j++){
            p[a[i]*j]++;
           }
        }
        for(int i=0; i<N; i++){
            if(p[a[i]]<2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}