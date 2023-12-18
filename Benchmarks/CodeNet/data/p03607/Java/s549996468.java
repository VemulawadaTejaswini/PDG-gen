import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Set<Integer> nums = new HashSet<>();
      for(int i = 0; i < n; i++) {
        int n = sc.nextInt();
        if(nums.contains(n))
          nums.remove(n);
        else
          nums.add(n);
      }
      System.out.println(nums.size());
  }
}
