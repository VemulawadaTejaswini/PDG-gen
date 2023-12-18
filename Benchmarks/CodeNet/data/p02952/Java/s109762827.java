public class Main {
public static void main(String args[])
{
    int n=136,sc=0;
    int l=(int) (Math.log10(n) + 1);
 
    if(l%2==0)
    {
     for(int i=n;i>0;i--)
     {
     
        int c=(int) (Math.log10(i) + 1);
        if(c%2==0)
         {
          sc++;  
         }
     }
       System.out.println(sc);
    }
    else
    {
     for(int i=n;i>0;i--)
     {
        int sn=(int) (Math.log10(i) + 1);
        if(!(sn%2==0))
         {
          sc++;  
         }
     }
      System.out.println(sc);
    }
}
}
	
	
	
