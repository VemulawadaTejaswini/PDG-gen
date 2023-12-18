import java.util.*; 
public class Main{
public static void main(String ... string){
  Scanner sc = new Scanner(System.in); 
  int x = sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(); 
  if(-a+b <= 0)
    System.out.println("delicious"); 
  else if(-a+b <= x) 
    System.out.println("safe"); 
  else System.out.println("dangerous");
}
}