    import java.util.*;
    import java.io.*;
     
     
    public class Main{
     
         public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();
           int [] arr = new int[n];
           
         
           
           for(int i=0;i<n;i++)
           arr[i] = scanner.nextInt();
          
          
          int d =0;
          
            if((arr[0]+arr[n-1])%2==0)
             d =(((arr[0]+arr[n-1])/2));
              else
                d =(((arr[0]+arr[n-1])/2))+1;
            
            int sum=0;
            for(int i=0;i<n;i++)
             sum = sum+(int) Math.pow((arr[i]-d),2);
        
            System.out.println(sum);
            
            
            //System.out.println()
            //for(int i=0;i<n;i++)
         }
    }