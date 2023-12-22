import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String[] a = sc.nextLine().split(" ");
    
    int[] nums = new int[a.length];
    
    for(int i=0; i<nums.length; i++) {
      nums[i] = Integer.parseInt(a[i]);
    }
    
    for(int i = 0; i<nums.length; i++) {
      if (nums[i] == 0) {
        System.out.println(i+1);
        break;
      }
    }
    
    


  }
}