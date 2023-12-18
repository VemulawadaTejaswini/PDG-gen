import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int c=0,st=0,en=4;
if(s.length()<4)
System.out.println(0);
else if(s.length()==4)
{
int q=Integer.parseInt(s);
if(q%2019==0)
System.out.println(1);
else
System.out.println(0);
}
else
{
for(int i=0;i<s.length()-4;i++)
{
for(int j=i+4;j<s.length();j++)
{
String z=s.substring(i,j+1);
long a=Long.parseLong(z);
if(div(a))
{
c++;
}
}
}
System.out.println(c);
}

}
public static boolean div(long x)
{
if(x%2019==0)
return true;
else
return false;
}
}