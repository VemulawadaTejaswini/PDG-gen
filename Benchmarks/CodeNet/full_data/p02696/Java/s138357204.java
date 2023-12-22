import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();
long n=sc.nextLong();
long m=0,c=0;
for(long i=1;i<=n;i++)
{
long s=(long)((long)(Math.floor(a*i/b))-(a*(long)(Math.floor(i/b))));
if(s>m)
{
m=s;
c=i;
}
}
System.out.println(m);
}
}
