import java.util.Scanner;
import java.util.Arryas;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[3];
    arr[0]=sc.nextInt();
    arr[1]=sc.nextInt();
    arr[2]=sc.nextInt();
    Arrays.sort(arr);
    System.out.println(arr[2]-arr[0]);
  }
}