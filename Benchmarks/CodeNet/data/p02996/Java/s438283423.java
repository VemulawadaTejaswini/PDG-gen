import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] works = new int[N][2];
    for(int i = 0; i < N; i++){
      works[i][1] = Integer.parseInt(sc.next());
      works[i][0] = Integer.parseInt(sc.next());
    }
    Arrays.sort(works, (a, b) -> Integer.compare(a[0], b[0]));
    
    int sum = 0;
    String ans = "Yes";
    for(int i = 0; i < N; i++){
      sum += works[i][1];
      if(works[i][0] < sum){
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}