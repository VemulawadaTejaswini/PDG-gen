import java.util.*;

public class Main {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
        
       int n=sc.nextInt();
     
       HashMap<Integer,Integer> map=new HashMap<>();
       long sum=0;
       for(int i=0;i<n;i++)
       {
           int k=sc.nextInt();
           sum+=k;
           if(map.containsKey(k))
           {
               int b=map.get(k);
               map.put(k,b+1);
           }
           else
           map.put(k,1);
       }
       
       int q=sc.nextInt();
       
        for(int i=0;i<q;i++)
        {
            
            int b=sc.nextInt();
            int c=sc.nextInt();
            
            if(map.containsKey(b))
            {
                
                int k=map.get(b);
                
                sum=sum- k*b+ k*c;
                map.remove(b);
                
                    if(map.containsKey(c))
                    {
                        int v=map.get(c);
                        map.put(c,v+k);
                    }
                    else
                    map.put(c,k);
                
                
                
            }
            System.out.println(sum);
            
        }
   
    

    }
}