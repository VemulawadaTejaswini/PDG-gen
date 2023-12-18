import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    for(int j = 0; j < 3; j++)
      a[j] = sc.nextInt();
    Arrays.sort(a);
    System.out.println(a[1] - a[0] + a[2] - a[1]);
  }
}
    