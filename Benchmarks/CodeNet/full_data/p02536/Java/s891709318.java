import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    // each travelled node is marked true (don't check below again)
        //a queue to check each time ki kitne hogye...
        //then a loop to find the niggas unconnected
        // loop stops at unconnected=0;
    public static int  chotumc(int p,boolean[] arr)
    {for(int i=p;i<arr.length;i++)
        if(!arr[i]) return i;
        return -1;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner st=new Scanner(System.in);
        int n=st.nextInt();
        int m=st.nextInt();
         ArrayList<Integer>[] arr = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            arr[i] = new ArrayList<Integer>(); 
        } 
        boolean[] trav= new boolean[n];
        for (int i = 0; i < n; i++) { 
           trav[i]=false;
        } 
        
        // each travelled node is marked true (don't check below again)
        //a queue to check each time ki kitne hogye...
        //then a loop to find the niggas unconnected
        // loop stops at unconnected=0;
        for(int i =0;i<m;i++)
        {int a=st.nextInt();
        int b=st.nextInt();
            arr[a-1].add(b-1); 
        arr[b-1].add(a-1); 
        }
        int p=0,res=0;
        int curr=0;
        int tot=-1;
        Queue<Integer> q 
            = new LinkedList<>(); 
        
        
            
        while(res!=-1)
        { // here to implement the queue and mark the few)
        trav[res]=true;
        for(int j=0;j<arr[res].size();j++)
            {//ek node k saare relatives ko add krre
            if(trav[arr[res].get(j)]==false)
            {q.add(arr[res].get(j));
            trav[arr[res].get(j)]=true;}}
            
    // each travelled node is marked true (don't check below again)
        //a queue to check each time ki kitne hogye...
        //then a loop to find the niggas unconnected
        // loop stops at unconnected=0;
            
            while(q.peek()!=null)
            {curr = q.poll();
            for(int j=0;j<arr[curr].size();j++)
                {//ek node k saare relatives ko add krre
                if(trav[arr[curr].get(j)]==false)
                {q.add(arr[curr].get(j));
                trav[arr[curr].get(j)]=true;}
                }
                
           }
            //ek bar ka hogya sara... now we gotta add the first unconnected element and start the drill;
            
            
            
          
          
          res=chotumc(p,trav);
          p=res; tot++;
          //loop will repeat
        } 
        
        
        
        
        
      System.out.println(tot);
            
        
        
    }
}
