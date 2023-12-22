import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
char ch[]=new char[n];
int in=0;
while(n-->0)
{
String s=sc.next();
if(s.equals("AB"))
{
if(a>b)
{
a=a-1;
b=b+1;
ch[in++]='B';
}
else 
{
a=a+1;
b=b-1;
ch[in++]='A';
}
}
else if(s.equals("BC"))
{
if(b>c)
{
b=b-1;
c=c+1;
ch[in++]='C';
}
else 
{
b=b+1;
c=c-1;
ch[in++]='B';
}
}
else
{
if(a>c)
{
a=a-1;
c=c+1;
ch[in++]='C';
}
else 
{
a=a+1;
c=c-1;
ch[in++]='A';
}
}
}

if(a<0 || b<0 || c<0)
System.out.println("No");
else
{
System.out.println("Yes");
for(int i=0;i<ch.length;i++)
System.out.println(ch[i]);
}
}
}
