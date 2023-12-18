import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] A = sc.next().toCharArray();
    char[] B = sc.next().toCharArray();
    char[] C = sc.next().toCharArray();
    int cnt = 0;
    for(int i=0; i<N; i++){
      if(A[i] == B[i] && A[i] == C[i]){
        continue;
      }else if(A[i] != B[i] && B[i] != C[i]){
        cnt += 2;
      }else{
        cnt++;
      }
    }
    System.out.print(cnt);
  }
}
