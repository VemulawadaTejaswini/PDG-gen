import java.util.Scanner;
import java.util.HashSet;

public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> colors = new HashSet<Integer>(3);
    colors.add(sc.nextInt());
    colors.add(sc.nextInt());
    colors.add(sc.nextInt());    
    sc.close();
    
    int result = colors.size();
    System.out.println(result);
  }