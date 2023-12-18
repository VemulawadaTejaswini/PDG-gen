import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    int
    int[] ans = new int[n];
    for(int i = n-1; i >= 0; i--){
        int tmp = a[i];
        for(int j = 2; j <= n; j++){
            if((i+1)*j >= n){
                break;
            }else{
                tmp += a[(i+1)*j-1];
            }
        }
        ans[i] = tmp%2;
    }
    for(int i = 0; i < n; i++){
        System.out.println(ans[i]);
    }
  }
}