import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zankin = sc.nextInt();
        int i;
        int j;
      
      for ( i = 0; zankin - 500 * i >= 0 ; i++ ) {
        i = i + 1 ;
      }
      zankin = zankin - 500 * i ;
      
      for ( j = 0; zankin - 5 * j >= 0 ; j++ ) {
        j = j + 1 ;
      }
      
      System.out.println(i * 1000 + j * 5);
      
    }
}
