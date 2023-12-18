import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(n%111==0?n:((n/111)+1)*111);
  }
}
