import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int need = a - b;
    if(need>=c){
      System.out.println(0);
    }else{
      System.out.println(c - need);
    }
  }
}
