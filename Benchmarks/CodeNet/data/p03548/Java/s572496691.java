import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int i =0;
    while ((Y + Z) * i +Z <= X) i++;
    System.out.println(i-1);
  }
}