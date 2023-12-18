import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();
    if((n*m)%2==1){
    System.out.println("Yes");
    }else{
 
    System.out.println("No");
    }
  }
}