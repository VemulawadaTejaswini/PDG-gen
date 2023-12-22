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
if(k==0)
System.out.println(s);
else
{
k=k-b;
if(k<=0)
System.out.println(s);
else
{
long d=Math.min(k,c);
s=s+(d*(-1));
System.out.println(s);
}
}


}

}
