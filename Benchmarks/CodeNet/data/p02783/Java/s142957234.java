import java.util.*;
class Main {
  public static void main(String[]agrs) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int a = scanner.nextInt();
    int aN = 0;
    
    for(int i=h; i>=0; i -=a){
      aN ++;
    }
    
    System.out.println(aN);
  }
}