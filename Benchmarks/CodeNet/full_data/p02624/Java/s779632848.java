import java.util.*; 
class Main 
{
public static void main(String []args) 
{
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt(); 
long sum=0; 
for(int i=1;i<=n;i++) 
{ 
int count=0;  
for(int j=1;j<=i;j++) 
{
if(n%j==0) 
{
count++;
}  
} 
sum=sum+(i*count);  
} 
  
System.out.print(sum);  
}
}
