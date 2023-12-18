import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int ab = (b-a)%2;
    int nn = n%2;
    
    if(ab == 1) System.out.println("Borys");
    else if(ab == 0) System.out.println("Alice");

  }
}