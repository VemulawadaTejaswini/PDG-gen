import java.util.*;
public class A
{ 
public static void main(String args[])throws Exception
{ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==1)
{ 
float p=1.0;
System.out.println(p);
}
else
{
int k=0;
for(int i=1;i<n;i+=2)
k++;
int p=(k*1.0)/n;
System.out.println(p);
}
}
}