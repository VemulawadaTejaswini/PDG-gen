import java.util.*; 
public class Main{
   static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
   public static void main(String ... string){
      Scanner sc = new Scanner(System.in); 
      int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(); 
      if(gcd(a,b) % c == 0){
      System.out.println("YES"); 
      }
     else System.out.println("NO");
  }
}