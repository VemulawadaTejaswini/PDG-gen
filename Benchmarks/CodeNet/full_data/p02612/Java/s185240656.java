import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt(); 
int value = 1000;


while(value<n)
{
value=value+1000;
}  

System.out.print(value-n);
} 
}