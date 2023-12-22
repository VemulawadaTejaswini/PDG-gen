import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                for(int k=0;k<j;k++)
                {
                    if(a[k]!=a[j] && a[i]!=a[j] && a[k]+a[j]>a[i])
                     c+=1;
                }
            }
        }
        System.out.println(c);
 
        
    }
}