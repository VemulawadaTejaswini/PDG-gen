import java.util.*;

class Main{
  public static void Main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int power2 = Math.pow(a, 2);
    int power3 = Math.pow(a, 3);
    int sum = a + power2 + power3;
    System.out.println(sum);
  }
}
    