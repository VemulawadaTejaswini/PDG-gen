import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
int c=0;
long s=100;
while(s<n)
{
long f=s/100;
c++;
s=s+f;
}
System.out.println(c);
}
}
