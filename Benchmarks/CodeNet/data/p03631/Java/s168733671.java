import java.util.*;
class btest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rev=0;
int num=n;
while(n!=0)
{
rev=rev*10+n/10;
n=n/10;
}
if(rev==num)
System.out.println("Yes);
else
System.out.println("No);
}
}
