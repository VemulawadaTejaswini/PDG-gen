import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int z =0;
    if((a+d-1)/d>=(c+b-1)/b){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}