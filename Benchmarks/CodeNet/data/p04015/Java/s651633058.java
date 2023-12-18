import java.util.*;
public class Main
{
    
    static HashMap<String,Long> h=new HashMap<String,Long>();
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double a=sc.nextDouble();
int ar[]=new int[n];
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
long pp=compute(0,ar,0,a,0);
System.out.println(pp);
}
    public static long compute(int index,int ar[],long sum,double a,int count)
{
    String zz=index+"|"+sum+"|"+count;
    if(h.containsKey(zz))
    return h.get(zz);
    else if(index==ar.length)
    {long zer=0;
        h.put(zz,zer);
    return zer;
    }
    else{
    long uu=sum+ar[index];
    double kk=1.0*uu;
    double ff=kk/(count+1);
    long counter=(ff==a)?1:0;
    
    counter+=compute(index+1,ar,uu,a,count+1);
    counter+=compute(index+1,ar,sum,a,count);
    h.put(zz,counter);
    return  counter;
    }
}}