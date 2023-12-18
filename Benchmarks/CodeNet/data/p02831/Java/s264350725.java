import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int gcd=getGCD(a,b);
	int lcm=getLCM(a,b,gcd);
    
    System.out.println(lcm);
  }
  
  private static int getGCD(int a,int b) {

for (int i=a;a>0;i--) {

if (a%i==0&&b%i==0) {

return i;

}

}return 1;

}

private static int getLCM(int a,int b,int gcd) {

return a*b/gcd;

}
}