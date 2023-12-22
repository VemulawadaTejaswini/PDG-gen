import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
String s = sc.nextLine(); 
String t = sc.nextLine(); 
int l= s.length(); 
int count=0; 
  
for(int i=0;i<l;i++) 
{
if(s.charAt(i)!=t.charAt(i)) 
{
count++;
}
} 
System.out.print(count);  
}  
}  