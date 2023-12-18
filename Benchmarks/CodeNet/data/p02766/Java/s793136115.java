import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      String[] inputs = input.split(" ");
      int n = Integer.parseInt(inputs[0]);
      int k = Integer.parseInt(inputs[1]);
      
      int count = 0;
      while(n != 0){
        int rem = n % k;
        n /= k;
        count++;
      }
      
      System.out.println(count);
    }
}