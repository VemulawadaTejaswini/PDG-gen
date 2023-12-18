import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();
    
    int ans = 0;
    for(int i = 0; i*R <= N; i++){
      for(int j = 0; j*G <= N-(i*R); j++){
        if((N-(i*R)-(j*G))%B == 0){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}