import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    long sum=0;
    for(int i=1;i<=n;i++)
    {
          int f=divCount(i);
       //System.out.println(f);
        sum=sum+(i*f);
       
     }
      System.out.println(sum);
   
  }
 public static int divCount(int c)
{
    int t=c;
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      for(int i = 2; i< c; i++) {
         while(c%i == 0) {
            if(map.containsKey(i))
	  map.put(i,map.get(i)+1);
            else
                  map.put(i,1);
            c= c/i;
         }
      }
      if(c>2) {
         if(map.containsKey(c))
	  map.put(c,map.get(c)+1);
            else
                  map.put(c,1);
           }
        int res=1;
     	
         for(int x:map.values())
	{
                              
	              res=res*(x+1);
                 }
   
     
   if(t==1)
	return 1;
  else if(t==2)
	return 2;
   else
           return res;
      }

}