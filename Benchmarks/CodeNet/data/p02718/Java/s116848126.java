import java.util.*;
import java.util.Collections;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Integer[] A = new Integer[N];
    int sum = 0;
    String ret = "Yes";
    double tokuhyou = sum / (4 * M);
    for(int i = 0; i < A.length; i++){
      A[i] = sc.nextInt();
      sum += A[i];
    }
    Arrays.sort(A, Collections.reverseOrder());
    for(int i = 0; i < M; i++){
      if(A[i] < tokuhyou){
        ret = "No";
        break;
      }
    }
    System.out.println(ret);
  }
}