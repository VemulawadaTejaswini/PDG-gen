import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    boolean result = a+b+(2*Math.sqrt(a)*Math.sqrt(b)) <= c;
    if(result){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}