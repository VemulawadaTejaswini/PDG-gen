import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
        a[i] = input.nextInt();
        
        int g=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==1)
        {
            g++;
            for(int j=i;j<n;j++)
            {
                if(a[j]==a[i]+1){
                    i=j;
                    g++;
                }
            }
        }
    }
    if(g==0)
        System.out.println(-1);
    else
        System.out.println(n-g);
  }
}
