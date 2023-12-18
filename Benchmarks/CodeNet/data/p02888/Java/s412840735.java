import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] val = new int[N];
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(val);
    
    long ans = 0;
    for(int i = 0; i < N-2; i++){
      for(int j = i+1; j < N-1; j++){
        long A = val[i];
        long B = val[j];
        for(int k = j+1; k < N; k++){
          long C = val[k];
          if(A+B > C && A+C > B && B+C > A){
            ans++;
          }
        }
      }
    }   
    System.out.println(ans);
  }
}