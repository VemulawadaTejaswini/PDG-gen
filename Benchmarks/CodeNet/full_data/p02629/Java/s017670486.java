import java.util.*;
public class Main{

     public static void main(String []args){
    
        int n;
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        int arr[]= new int[n];
        
        int sum = 0;
        
        for(int i=0;i<n;i++){
            
            int a = in.nextInt();
            arr[i]=a;
            sum = sum+a;
            map.put(A[i],map.getOrDefault(A[i],0) + 1);

        }
        
        int q= in.nextInt();
        
        while(q>0){
            
            int b = in.nextInt();
            int c = in.nextInt();
            
            if(map.containsKey(b))
                sum = b * map.get(b) - c *map.get(b);
                System.out.println(sum);
            else
                System.out.println(sum);
            
            q--;
        }
             
              }
}