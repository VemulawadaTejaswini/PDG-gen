import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int L = sc.nextInt();
      double maxArea = 0.0;

      double leftLen = 0.0, rightLen = L * 1.0;
      while(Math.abs(rightLen - leftLen) > 1e-10) {
        double midLen1 = leftLen + (rightLen - leftLen) / 3;
        double midLen2 = rightLen - (rightLen - leftLen) / 3;
        double maxArea1 = maxArea(L - midLen1) * midLen1;
        double maxArea2 = maxArea(L - midLen2) * midLen2;
        maxArea = Math.max(maxArea, Math.max(maxArea1, maxArea2));
        if(maxArea1 < maxArea2)
          leftLen = midLen1;
        else
          rightLen = midLen2;
      }
      System.out.println(maxArea);
  }

  private static double maxArea(double l) {
    double leftLen = 0.0, rightLen = l;
    while(Math.abs(rightLen - leftLen) > 1e-10) {
        double midLen1 = leftLen + (rightLen - leftLen) / 3;
        double midLen2 = rightLen - (rightLen - leftLen) / 3;
        double area1 = midLen1 * (l - midLen1);
        double area2 = midLen2 * (l - midLen2);
        if(area1 < area2)
          leftLen = midLen1;
        else
          rightLen = midLen2;
    }
    double len = (rightLen + leftLen) / 2;
    return len * (l - len);
  }
}