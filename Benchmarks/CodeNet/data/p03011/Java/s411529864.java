import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    int min = 101;

    int[] data ={n + m , m + l , n + l };

    for (int i = 0 ; i < 3 ; i++ ) {
      min = Math.min(n + m , min);
    }

    System.out.println(min);


  }
}
