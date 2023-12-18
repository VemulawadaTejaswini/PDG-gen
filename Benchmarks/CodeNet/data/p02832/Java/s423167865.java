import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    for(int i=0;i<N;i++){
      A[i] = Integer.parseInt(sc.next());
    }
    int target = 1;
    boolean b = false;
    for(int i=0;i<N;i++){
      if(A[i] != target){
        if(A[i] > N){
          System.out.println(-1 );
        }
      }else{
        target++;
        b = true;
      }
    }
    if(b==true){
      System.out.print(N-target+1);
    }else{
      System.out.print(-1);
    }
    return;
  }
}

