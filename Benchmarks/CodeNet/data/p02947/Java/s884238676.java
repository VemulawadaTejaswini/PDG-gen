import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
String g=sc.next();
char c1[]=g.toCharArray();
Arrays.sort(c1);
String b=String .valueOf(c1);
a[i]=b;
}
int c=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(isAngram(a[i],a[j]))
c++;
}
}
System.out.print(c);

}
public static boolean isAngram(String a,String b)
{

if(a.equals(b))
return true;
else
return false;
}
}