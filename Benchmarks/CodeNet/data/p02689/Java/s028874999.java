import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
Set<Integer> s=new HashSet<>();
while(m-->0)
{
int a1=sc.nextInt();
int b1=sc.nextInt();
s.add(b1);
}

System.out.println(s.size());
}
}
