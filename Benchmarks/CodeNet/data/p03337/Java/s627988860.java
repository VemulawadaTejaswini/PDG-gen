import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int plus = a + b;
    int minus = a - b;
    int multi = a * b;
    
    int max = plus;
    if (plus < minus) {
      max = minus;
    } else if (plus < multi) {
      max = multi;
    }
    
    if (minus < multi) {
      max = multi;
    } else {
      max = minus;
    }
    
    System.out.println(max);
  }
}