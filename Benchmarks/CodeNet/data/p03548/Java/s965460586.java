import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int count = 0;
    x -= 2 * z;
    while(x >= y){
      count++;
      x -= y+z;
    }
    System.out.println(count);
  }
}
