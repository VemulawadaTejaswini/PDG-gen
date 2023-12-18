import java.util.*;
/*
public class BSLI{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int A,B,K;
    Set<Integer> set = new TreeSet<Integer>();
    A = s.nextInt();
    B = s.nextInt();
    K = s.nextInt();
    for(int i = A; i < A + K && i <= B ; i++){
      set.add(i);
    }

    for(int i = B; i > B - K && i >= A ; i--){
      set.add(i);
    }

    for (Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
      System.out.println(itr.next());
    }

  }
}
*/
public class BSLI{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int A,B,K;
    Set<Integer> set = new TreeSet<Integer>();
    A = s.nextInt();
    B = s.nextInt();
    K = s.nextInt();
    if(A + K >= B - K){
      for(int i = A; i <= B ; i++){
        System.out.println(i);
      }
    }
    else{
      for(int i = A; i < A + K && i <= B ; i++){
        System.out.println(i);
      }
      int start;
      if(B - K < A)start = A;
      else start = B - K + 1;
      for(int i = start; i <= B && i >= A ; i++){
        System.out.println(i);
      }
    }
  }
}
