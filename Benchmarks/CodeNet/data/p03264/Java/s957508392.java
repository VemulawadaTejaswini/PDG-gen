import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int gs = n/2;
    int ks = n - gs;
    System.out.println(ks*gs);
  }
}
