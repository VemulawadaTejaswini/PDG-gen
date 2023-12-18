import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ant[] = new int[5];
    for (int i = 0; i < 5; i++){
      ant[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    String ans[] = {":(", "Yay!"};
    int a = 1;
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 4; j++){
        if (i != j){
          if (Math.abs(ant[i]-ant[j]) > k) a *= 0;
        }
      }
    }
    System.out.println(ans[a]);
  }
}