import java.util.*;
class A
{ 
public static void main(String args[])throws Exception
{ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==1)
{ 
double p=1.0;
System.out.println(p);
}
else
{
int k=0;
for(int i=1;i<n;i+=2)
k++;
double p=(k*1.0)/n;
System.out.println(p);
}
}
}
