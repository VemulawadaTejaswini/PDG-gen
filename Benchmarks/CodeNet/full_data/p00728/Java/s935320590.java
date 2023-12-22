import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int sum=0;
            if(n==0)break;
            int[] s=new int[n];
            for(int i=0;i<n;i++)s[i]=sc.nextInt();
            Arrays.sort(s);
            s[0]=0;
            s[n-1]=0;
            for(int i=0;i<n;i++)sum+=s[i];
            System.out.println(sum/(n-2));
        }
        sc.close();
    }
}
