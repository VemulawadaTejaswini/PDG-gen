import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while(true){
      int m = scanner.nextInt();
      int f = scanner.nextInt();
      int r = scanner.nextInt();
      if(m == -1 && f == -1 && r == -1){
        break;
      }
      if((m == -1 || f == -1) || (m + f < 30)){
        System.out.println("F");
      }
      if(m + f >= 80){
        System.out.println("A");
      }
      if(m + f >= 65 && m + f < 80){
        System.out.println("B");
      }
      if(m + f >= 30 && m + f < 50){
        System.out.println("D");
      }
      if(m + f >= 30 && m + f < 65){
        System.out.println("C");
      }
    }
  }
}