import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long a=sc.nextLong();
long b=sc.nextLong();
long c=sc.nextLong();
char ch[]=new char[n];
int in=0;
if((a==0 && b==0 && c==0) || (a==0 && c==0) || (a==0 && b==0) || (b==0 && c==0))
System.out.println("No");
else{
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
System.out.println(ch[i]);}
}
}
}
