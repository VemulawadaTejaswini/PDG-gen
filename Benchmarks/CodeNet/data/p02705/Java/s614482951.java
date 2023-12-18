import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      double r = Double.parseDouble(sc.next());
      
      System.out.println(calCircumference(r));
      
    }
  public static double calCircumference(double r) {
        return 2 * Math.PI * r;
    }
}