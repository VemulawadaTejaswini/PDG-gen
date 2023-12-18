import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = N * 800;
    int y = 200 * ((N - (N % 15)) / 15);
    int total = x - y;
    System.out.println(total);
    }
}
