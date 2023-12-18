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
    for(int i = 0; i < A.length; i++){
      A[i] = sc.nextInt();
      sum += A[i];
    }
    Arrays.sort(A, Collections.reverseOrder());
    for(int i = 0; i < M; i++){
      if(A[i] < sum / (4 * M)){
        ret = "No";
        break;
      }
    }
    System.out.println(ret);
  }
}