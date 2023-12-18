import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextLong();
        }
        String ans=String.valueOf(a[1]);
        if(n%2==0){
            for (int i = 2; i <= n; i++) {
                if(i%2==0){
                    ans=String.valueOf(a[i])+" "+ans;
                }else{
                    ans=ans+" "+String.valueOf(a[i]);
                }
            }
        }else{
            for (int i = 2; i <= n; i++) {
                if(i%2==0){
                    ans=ans+" "+String.valueOf(a[i]);
                }else{
                    ans=String.valueOf(a[i])+" "+ans;
                }
            }
        }
        System.out.println(ans);
    }
}