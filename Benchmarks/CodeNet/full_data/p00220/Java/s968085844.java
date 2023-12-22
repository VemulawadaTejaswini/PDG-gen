import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    while (true) {
      double n = sc.nextDouble();
      if (n == -1) break;
      
      int left = (int)n;
      String lhs = Integer.toString(left, 2);
      
      if (lhs.length() > 8) {
        System.out.println("NA");
        continue;
      }
      
      double right = n % 1;
      String rhs = "";
      //int rem = 4;
      
      HashSet<Double> hs = new HashSet<Double>();
      hs.add(right);
      while (true) {
        right *= 2;
        if (hs.contains(right)) break;
        hs.add(right);
        
        rhs += (int)right;
        right %= 1;
      }
      if (rhs.length() > 4) {
        System.out.println("NA");
        continue;
      }
      /*
      while (rem-- > 0 && right != 0) {
         right *= 2;
         rhs += (int)right;
         right %= 1;
      }
      
      if (right != 0) {
        System.out.println("NA");
        continue;
      }*/
      
      while (lhs.length() != 8) lhs = "0" + lhs;
      while (rhs.length() != 4) rhs += "0";
      
      System.out.println(lhs + "." + rhs);
    }
  }
}