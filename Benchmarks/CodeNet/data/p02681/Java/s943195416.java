import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
String s1 = sc.nextLine(); 
String s2 = sc.nextLine(); 
int l1=s1.length(); 
int l2 =s2.length(); 
  
if(l1==(l2+1)) 
{  
if(s1.equals(s2.substring(0,l2))) 
{
System.out.print("Yes");
} 
else 
{
System.out.println("No");
}  
}  
else 
{
System.out.println("No");
}

}  
}
