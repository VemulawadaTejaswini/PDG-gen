import java.util.*;
 class Main
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
     HashMap<String,Integer> hm=new HashMap<String,Integer>();
     while(n-->0)
     {
       String s=sc.next();
       if(hm.containsKey(s))
          hm.put(s,1+hm.get(s));
       else
         hm.put(s,1);
     }
   for(Map.Entry m : hm.entrySet()){    
    System.out.println(m.getKey()+" X "+m.getValue());    
   }  

   }
}