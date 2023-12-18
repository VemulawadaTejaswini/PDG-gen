import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int N = sc.nextInt();
    int h[] = new int[N];
    int s = 0;
    for(int i = 0; i < 500; i++){
      h[i] = sc.nextInt();
    }
    for(int i = 0; i < 500; i++){
      if(h[i] > K){
        s += s;
      }
    }
  }
}
        