import java.util.*;

class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int[] A_Books = new int[N];
    int[] B_Books = new int[M];
    for(int i = 0;i < N;i++) {
      A_Books[i] = sc.nextInt();
    }
    for(int i = 0;i < M;i++) {
      B_Books[i] = sc.nextInt();
    }
    int A_counter = 0;
    int B_counter = 0;
    int result = 0;
    int now = 0;
    Boolean a = false;
    Boolean b = false;
    while(true) {
      if((A_counter >= N) && (B_counter >= M)) {
        break;
      }
      if(A_counter >= N) {
        a = true;
      }
      if(B_counter >= N) {
        b = true;
      }
      int minTimes = 0;
      if((a == false) && (b == false)) {
        minTimes = Math.min(A_Books[A_counter],B_Books[B_counter]);
      }else if(a == true) {
        minTimes = B_Books[B_counter];
      }else if(b == true) {
        minTimes = A_Books[A_counter];
      }
      if(((now + minTimes) <= K)) {
        result++;
        now = now + minTimes;
        if((a == false) && (b == false)){
          if(A_Books[A_counter] > B_Books[B_counter]) {
            B_counter++;
          }
          else if(A_Books[A_counter] < B_Books[B_counter]) {
            A_counter++;
          }
        }else if(a == true) {
          B_counter++;
        }else if(b == true) {
          A_counter++;
        }
      }else{
        break;
      }
    }
    System.out.println(result);
  }
}
