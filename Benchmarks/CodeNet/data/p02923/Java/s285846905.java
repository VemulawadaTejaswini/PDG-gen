import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] H = new int[N];
    for(int i = 0; i < N; i++){
      H[i] = sc.nextInt();
    }
    int count = 0;
    int tmpCount = 0;

    for(int i = 1; i < N; i++){
      if(H[i - 1] >= H[i]){
        tmpCount++;
      } else {
        if(count < tmpCount){
          count = tmpCount;
        }
        tmpCount = 0;
      }
    }
    if(count < tmpCount){
      count = tmpCount;
    }

    System.out.println(count);
  }
}