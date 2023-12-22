import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    if(N == 1){
      System.out.println(0);
      return;
    }
    for(int i = 0; i<N;i++){
      A[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(A);
    int count = 0;
    loop: for(int i = N -1; i >= 0; i--){
      for(int j = 0; j<i;j++){
        if(A[i]%A[j] == 0){
          continue loop;
        }
      }
      count++;
    }
    if(A[0]==A[1]){
      count--;
    }
    System.out.println(count);
  }
}