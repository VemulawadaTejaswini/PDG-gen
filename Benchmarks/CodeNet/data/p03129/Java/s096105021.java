import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      int N = sc.nextInt();
      int K = sc.nextInt();
      int odd = ((N%2)==0) ? 0:1;
      int max = ((N - (N%2)) / 2) + odd;
      //System.out.println(max);
      if( K <= max){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
 
}