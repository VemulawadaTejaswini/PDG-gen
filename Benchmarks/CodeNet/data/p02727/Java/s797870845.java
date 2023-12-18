import java.util.*;
public class Main
{public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int y=sc.nextInt();
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int ar[]=new int[a];
     for(int i=0;i<a;i++)
       ar[i]=sc.nextInt();
    int br[]=new int[b];
     for(int i=0;i<b;i++)
       br[i]=sc.nextInt();
    int cr[]=new int[c];
     for(int i=0;i<c;i++)
       cr[i]=sc.nextInt();
    int temp[]=cr;
    int mar[]=new int[a+c];
    int ind=0;
    for(int i=0;i<a+c;i++)
    { if(i<a)
       mar[i]=ar[i];
      else
       {mar[i]=cr[ind];
        ind++;}
    }
    int mbr[]=new int[b+c];
    ind=0;
    for(int i=0;i<b+c;i++)
    { if(i<b)
       mbr[i]=br[i];
      else
       {mbr[i]=cr[ind];
        ind++;}
    }
    Arrays.sort(mar);
    Arrays.sort(mbr);
    long sum=0;
  for(int i=0;i<x;i++)
    sum+=mar[a+c-1-i];
  for(int i=0;i<y;i++)
    sum+=mbr[b+c-1-i];
   System.out.println(sum);  
    }
}