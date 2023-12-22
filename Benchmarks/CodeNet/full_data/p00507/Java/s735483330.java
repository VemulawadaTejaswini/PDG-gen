import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n2 =Math.min(4, n);
    int[] list = new int[n2];
    for (int i = 0; i < n2; i++) {
      list[i] = sc.nextInt();
    }
    int n3 = n2 * (n2-1);
    int[] list2 = new int[n3];
    int i = 0;
    for(int i1 = 0; i1 < n2; i1++){
      for(int i2 = 0; i2 < n2; i2++){
        String x1 = String.valueOf(list[i1]);
        String x2 = String.valueOf(list[i2]);
        String newX = x1 + x2;
        System.out.println(newX);
        i ++;
      }
    }
  }
}
