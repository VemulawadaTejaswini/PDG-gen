import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();
long c=sc.nextLong();
long k=sc.nextLong();
long s=0;
s=s+(a)*1;
k=k-a;
if(k<=0)
System.out.println(s);
else
{
int f=0;

long d=Math.min(k,b);
k=k-d;
if(k<=0)
System.out.println(s);
else
{
long e=Math.min(k,c);
s=s-e;
System.out.println(s);
}


}


}

}
