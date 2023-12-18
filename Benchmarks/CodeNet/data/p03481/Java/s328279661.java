import java.util.*;
class MultipleGift
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
long x=sc.nextLong();
long  y=sc.nextLong();
long count=0;
while(y>=x)
{
count+=1;
y=y/2;
}
System.out.println(count);
}
}
