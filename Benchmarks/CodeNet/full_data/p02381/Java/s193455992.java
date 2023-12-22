import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            int[] s=new int[n];
            double m=0,ans=0;
            for(int i=0;i<n;i++){
                s[i]=sc.nextInt();
                m+=s[i];
            }
            m/=n;
            for(int i=0;i<n;i++)ans+=Math.pow(s[i]-m,2);
            ans/=n;
            System.out.println(Math.sqrt(ans));
        }
        sc.close();
    }
}
