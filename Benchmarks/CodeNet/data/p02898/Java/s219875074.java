
package b.roller.coaster;
import java.util.Scanner;

public class BRollerCoaster {
static Scanner reader =new Scanner (System.in);
  
    public static void main(String[] args) {
       int arr[]=new int [101010];
       int k;
       int n;
       int cnt=0;
       n=reader.nextInt();
       k=reader.nextInt();
       for(int i=0;i<n;i++)
       {
           arr[i]=reader.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           if(arr[i]>=k)
           {
               cnt++;
           }
       }
       System.out.println(cnt);
    }
    
}
