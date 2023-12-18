import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] num = new int[5];
    for(int i = 0; i < 5; i++){
      num[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    
    String ans = "Yay!";
    a : for(int i = 0; i < 4; i++){
      for(int j = i+1; j < 5; j++){
        if(Math.abs(num[i] - num[j]) > k){
          ans = ":(";
          break a;
        }
      }
    }
    System.out.println(ans);
  }
}