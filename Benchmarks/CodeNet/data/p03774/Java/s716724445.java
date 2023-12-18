import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int min=Math.abs(c[0]-a[i])+Math.abs(d[0]-b[i]);
            ans[i]=1;
            for(int j=0;j<n;j++){
                int len=Math.abs(c[j]-a[i])+Math.abs(d[j]-b[i]);
                if(min>len){
                    min=len;
                    ans[i]=j+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
        


    }
}
