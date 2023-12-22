import java.util.*;

class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();
    long[] A_Books = new long[N];
    long[] B_Books = new long[M];
    for(int i = 0;i < N;i++) {
      A_Books[i] = sc.nextLong();
    }
    for(int i = 0;i < M;i++) {
      B_Books[i] = sc.nextLong();
    }
    int A_counter = 0;
    int B_counter = 0;
    long result = 0;
    long now = 0;
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
      long mlongimes = 0;
      if((a == false) && (b == false)) {
        mlongimes = Math.min(A_Books[A_counter],B_Books[B_counter]);
      }else if(a == true) {
        mlongimes = B_Books[B_counter];
      }else if(b == true) {
        mlongimes = A_Books[A_counter];
      }
      if(((now + mlongimes) <= K)) {
        result++;
        now = now + mlongimes;
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
