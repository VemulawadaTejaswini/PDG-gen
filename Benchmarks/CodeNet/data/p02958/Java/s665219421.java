import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    int downCounter = 0;
    boolean ans = true;
    for(int i = 0;i < n;i++){
      p[i] = sc.nextInt();
    }
    for(int j = 0;j < n - 1;j++){
      if(p[j] > p[j + 1]){
        downCounter++;
        if(downCounter == 3){
          ans = false;
          break;
        }
      }
    }
    if(ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
