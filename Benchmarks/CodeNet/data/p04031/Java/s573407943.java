    import java.util.*;
    import java.io.*;
     
     
    public class Main{
     
         public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();
           int [] arr = new int[n];
           
       
         
           
           for(int i=0;i<n;i++)
           arr[i] = scanner.nextInt();
           
           Arrays.sort(arr);
           
           long min =(long)Math.pow(10,7);
           long index=0;
          
            for(int i=arr[0];i<=arr[n-1];i++)
            {
                long sum=0;
                for(int j=0;j<n;j++)
                {
                    sum=sum+(long) Math.pow((arr[j]-i),2);
                   
                }
                 if(sum<min){
                    min=sum;
                    index=sum;
                 }
                
            }
            
            System.out.println(index);
            
            
        
            
            //System.out.println()
            //for(int i=0;i<n;i++)
         }
    }