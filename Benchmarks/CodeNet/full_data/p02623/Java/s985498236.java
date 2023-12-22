import java.util.*;
public class Main
{
  
  public static void main(String args[]) 
  {
    
    Scanner sc=new Scanner(System.in);
   int len1=sc.nextInt();
   int len2=sc.nextInt();
   int k=sc.nextInt();
   int a1[]=new int[len1];
  int a2[]=new int[len2];
   for(int i=0;i<len1;i++)
     a1[i]=sc.nextInt();
    for(int i=0;i<len2;i++)
      a2[i]=sc.nextInt();
    int sum=0;
   int count=0;
    int t=0;
   int c1=0;
   int c2=0;
    while(k>sum)
    {
        if(t==0 && c1<len1){
          sum=sum+a1[c1];
          c1++;
          t=1;
          if(sum<=k)
            count++;
        }
        else if(t==1 && c2<len2)
        {
            sum=sum+a2[c2];
           c2++;
            t=0;
             if(sum<=k)
            count++;
        }
        else
        {
            if(c2<len2)
            {
                sum=sum+a2[c2];
              
                c2++;
               
               if(sum<=k)
                 count++;
            }
            else if(c1<len1)
            {
                 sum=sum+a1[c1];
               c1++;
                if(sum<=k)
                 count++;
            }
        }
    }
    System.out.println(count);



  }
}