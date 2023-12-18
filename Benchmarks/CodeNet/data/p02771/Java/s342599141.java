import java.util.*; 
public class Main{
public static void main(String ... string){
Scanner sc = new Scanner(System.in); 
  int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(); 
  if( a==b && b!=c) System.out.println("Yes"); 
 else if( a ==c && b != c ) System.out.println("Yes"); 
  else if( b == c && b!=a ) System.out.println("Yes"); 
  else System.out.println("No"); 
}
}
