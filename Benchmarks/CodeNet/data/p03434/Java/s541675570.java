import java.util.Scanner;
 import java.util.Arrays;

          
public class SolveB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        int arr[]=new int[n];

     
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            
        }
        Arrays.sort(arr);
        int sum=0,sum1=0;
        for(int i=n-1;i>=0;i=i-2)
        {
            sum=sum+arr[i];
            
            
        }
        for(int j=n-2;j>=0;j=j-2)
        {
            sum1=sum1+arr[j];
        }
        System.out.println(sum-sum1);
         //System.out.println(sum1);
        
        
 
        
       
        
    }
    
}
