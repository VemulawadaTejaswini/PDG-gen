import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int Ans = 0;
    int N = s.nextInt();
    int M = s.nextInt();
    ArrayList<Integer> A = new ArrayList<Integer>();
    for (int i = 0; i < N; i++){
      A.add(s.nextInt() + s.nextInt()* 10000 );
    }
    Collections.sort(A,Comparator.reverseOrder());
    int j = 0;
    for (int i = M;i>=0;i--){
      if (A.size() != 0){
        while (A.get(j) % 10000 + i > M) {
          j++;
          if (j >= A.size()-1){
            A.add(0);
            j = A.size()-1;
            break;
          }
        }
      }
      Ans += A.get(j)/10000;
      A.remove(j);
      j = 0;
    }
    System.out.println(Ans);
  }
}