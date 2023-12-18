import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] h = new int[1000];

    for(int i = 1; i <= 999; i++){
      h[i] = h[i-1] + i;
    }

    int ans = 0;
    for(int i = 1; i <= 999; i++){
      if(b - a == h[i] - h[i-1]){
        ans = h[i] - b;
        break;
      }
    }

    System.out.println(ans);
  }
}
