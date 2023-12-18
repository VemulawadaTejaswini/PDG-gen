import java.util.*;

public class Main {
    public static int po[];
    public static int ans=Integer.MAX_VALUE;
    public static int[]abc;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        abc=new int[3];
        for(int i=0;i<3;i++)abc[i]=sc.nextInt();
        
        po=new int[n];
        for(int i=0;i<n;i++)po[i]=sc.nextInt();
        
        int ppp[]=new int[3];
        po(ppp,n,0);
        System.out.println(ans);
    }
    public static void po(int[]a,int n,int ans2){
        if(n==0){
            if(a[0]!=0&&a[1]!=0&&a[2]!=0){
                for(int i=0;i<3;i++){
                    ans2+=Math.abs(a[i]-abc[i]);
                }
                ans=Math.min(ans,ans2);
            }
        }
        else{
        
            int[]b=a.clone();
            
            po(a,n-1,ans2);
            
            if(a[0]==0){
                b[0]+=po[n-1];
                po(b,n-1,ans2);
            }
            else {
                b[0]+=po[n-1];
                po(b,n-1,ans2+10);
            }
            
            if(a[1]==0){
                b=a.clone();
                b[1]+=po[n-1];
                po(b,n-1,ans2);
            }
            else {
                b=a.clone();
                b[1]+=po[n-1];
                po(b,n-1,ans2+10);
            }
            
            if(a[2]==0){
                b=a.clone();
                b[2]+=po[n-1];
                po(b,n-1,ans2);
            }
            else{
                b=a.clone();
                b[2]+=po[n-1];
                po(b,n-1,ans2+10);
            }
           
            
        }
    }
}
