import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    Integer A[] = new Integer[N];
    for (int i = 0 ; i < N ; i++) {
      A[i] = scan.nextInt();
    }
    Arrays.sort(A, Collections.reverseOrder());
    for (int i = 0 ; i < N - 1 ; i++) {
      if(A[i].equals(A[i + 1])){
        System.out.println("NO");  
        return;
      }
    }
    System.out.println("YES");    
  }
}