import java.util.*;
class Main
{
public static void main (String[] args)
{
Scanner sc =new Scanner(System.in);
int ans=0;
int n= sc.nextInt();
int[] a= new int[100];
Arrays.fill(a,0);
for(int i=0;i<n;i++)
a[sc.nextInt()-1]++;
for(int i=0;i<100;i++)
if(a[i]>0)
ans++;
System.out.println(ans);
}
}