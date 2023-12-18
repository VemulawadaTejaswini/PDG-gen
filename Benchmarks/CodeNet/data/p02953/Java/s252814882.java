import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, i;
    number = Integer.parseInt(sc.next());
    int[] height = new int[number];
    for(i = 0; i < number; i++) {
      height[i] = Integer.parseInt(sc.next());
    }
    for(i = 1; i < number; i++) {
      if(height[i-1] == height[i]) continue;
      else if(height[i-1] <= height[i] - 1) height[i]--;
      else break;
    }
    if(i == number) System.out.println("Yes");
    else System.out.println("No");
  }
}
