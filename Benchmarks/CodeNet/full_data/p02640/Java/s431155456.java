import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
int n = Integer.parseInt(sc.nextLine()); 
int t = Integer.parseInt(sc.nextLine());
boolean flag=false;
int b=0;
for(int i=0;i<=n+1;i++)
{
b=n-i; 
if(((2*i)+(4*b))==t) 
{
flag=true;
}
}
if(flag==true)
{
System.out.println("Yes");
}
else 
{
System.out.println("No");
}

} 
}