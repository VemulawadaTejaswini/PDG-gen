import java.util.*; 
public class Main{
public static void main(String ... string){
Scanner sc = new Scanner(System.in); 
  String s1 = sc.nextLine(); 
  String s2 = sc.nextLine(); 
  int ball1 = sc.nextInt(); 
  int ball2 = sc.nextInt(); 
  String u = sc.nextLine(); 
  if(u.equals(s1))
    ball1--; 
  else ball2--; 
  System.out.println(ball1 + " " + ball2); 
}
}
