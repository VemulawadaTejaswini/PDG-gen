import java.util.*;
public class main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] data = new int[n];
      int sum = 0;

      for(int i = 0;i<n;i++){
        data[i] = sc.nextInt();
      }
      Arrays.sort(data);

      for(int i = n-1;i>n-1-k;i--){
        sum = sum + data[i];
      }

      System.out.println(sum);

  }
}
