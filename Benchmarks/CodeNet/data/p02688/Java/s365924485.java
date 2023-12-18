import java.util.*;
public class Main2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
Set<Integer> s=new HashSet<>();
while(k-->0)
{
int d=sc.nextInt();
while(d-->0)
{
int a=sc.nextInt();
s.add(a);
}
}

System.out.println(n-s.size());
}
}
