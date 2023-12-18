import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] data = new int[n];

      for(int i = 0;i<n;i++){
        data[i] = sc.nextInt();
      }
      Arrays.sort(data);

      System.out.println(data[n-1]+data[n-2]+data[n-3]);



  }
}
