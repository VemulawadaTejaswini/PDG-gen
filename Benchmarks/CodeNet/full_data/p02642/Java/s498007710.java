import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0;
    int[] A = new int[n];
    for(int i = 0; i < n; i++){
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    int offset = 0;
    while(offset < A.length) {
      int num = A[offset];
      for (int j = 0; j < A.length; j++) {
        if(j == offset) {
          if(offset == A.length -1){
            answer++;
          }
          continue;
        }
        if(num < A[j]){
          answer++;
          break;
        }
        if(num % A[j] == 0){
          break;
        }
      }
      offset++;
    }
    System.out.println(answer);
  }
}