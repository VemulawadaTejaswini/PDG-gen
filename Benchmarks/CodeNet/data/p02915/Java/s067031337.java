import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp = n;
    for(int i = 1; i < 3; i++){
      n *= tmp;
    }
    
    System.out.println(n);
    
  }
}