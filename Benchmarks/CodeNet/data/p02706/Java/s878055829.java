import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int day;
    int N = s.nextInt();
    int M = s.nextInt();
    int[] A = new int[M];
    for(int i = 0; i < M; i++) {
      A[i] = s.nextInt();
      day = M - A[i];
    }

    if(day >= 0){
      System.out.println(day);
    }else {
      System.out.println(-1);
    }

    
  }
}