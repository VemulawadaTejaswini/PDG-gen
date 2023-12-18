import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0,f=0;
if(n%100==0 || n%101==0 || n%102==0 || n%103==0 || n%104==0 || n%105==0 )
System.out.println(1);
else{
for(int i=100;i<=105;i++)
{
s=s+i;
if(n%s==0)
{
f=1;
break;
}
}
if(f==1)
System.out.println(1);
else
System.out.println(0);
}
}
}

