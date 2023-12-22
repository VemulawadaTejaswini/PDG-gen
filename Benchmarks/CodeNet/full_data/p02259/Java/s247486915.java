
import java.util.*;


class Main
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();
            int [] arr = new int [n];
            int ctn=0;
            for(int i = 0; i<n; i++)arr[i] = sc.nextInt();
            for(int i = n; i>0; i--)
            {
                for(int j = 0; j<n-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                        ctn++;      
                    }
                }
            }     
            for(int i = 0; i<n; i++)
            {
                 if(i==n-1)
                {
                    System.out.printf("%d\n",arr[i]);
                    System.out.println(ctn);
                    break;
                }
                System.out.printf("%d ",arr[i]);            
            }
    }
}
       



