import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int s[]=new int[4];
while(scan.hasNext())
{
int t=scan.nextInt();
int n=scan.nextInt();
if(t==1)s[t-1]+=6000*n;
if(t==2)s[t-1]+=4000*n;
if(t==3)s[t-1]+=3000*n;
if(t==4)s[t-1]+=2000*n;
}
for(int i=0;i<4;i++)
{
System.out.println(s[i]);
}
}
}