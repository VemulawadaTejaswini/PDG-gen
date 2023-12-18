import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if((a-b)%2==0) {
      System.out.println("Alice");
    }
    else {
      System.out.println("Borys");
    }
  }
}