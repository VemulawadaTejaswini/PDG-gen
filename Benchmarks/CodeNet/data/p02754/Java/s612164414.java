import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int set = n / (a+b);
    int amari = n % (a+b);
    int ama = a;
    if(amari < a){
      ama = amari;
    }
    System.out.println(set * a + ama);

  }
}
