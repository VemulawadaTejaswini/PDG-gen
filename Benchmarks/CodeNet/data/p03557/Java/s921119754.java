import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Long> listA = new ArrayList<>();
    long[] listB = new long[N];
    List<Long> listC = new ArrayList<>();
    
    String[] A = sc.nextLine().split(" ");
    String[] B = sc.nextLine().split(" ");
    String[] C = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      listA.add(Long.parseLong(A[i]));
      listC.add(Long.parseLong(C[i]));
      listB[i] = Long.parseLong(B[i]);
    }
    
    Collections.sort(listA);
    Collections.sort(listC, Collections.reverseOrder());
    
    long sum = 0;
    for(int i = 0; i < N; i++){
      long n = listB[i];
      long a = N;
      long c = N;
      for(int j = 0; j < N; j++){
        if(listA.get(j) >= n){
          a = j;
          break;
        }
      }
      for(int j = 0; j < N; j++){
        if(listC.get(j) <= n){
          c = j;
          break;
        }
      }
      sum += a * c;
    }
    System.out.println(sum);
  }
}