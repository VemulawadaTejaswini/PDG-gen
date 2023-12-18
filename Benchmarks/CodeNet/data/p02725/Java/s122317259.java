import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
 Arrays.sort(a);
long s=0;
for(int i=0;i<n-1;i++)
{
	if(a[i]==0)
	continue;
	else
	{
		s=s+(a[i+1]-a[i]);
	}		
}
System.out.println(s);
}

}