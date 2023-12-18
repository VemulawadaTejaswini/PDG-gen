import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    long[] A = new long[N];
    List<Long> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      long n = Long.parseLong(S[i]);
      A[i] = n;
      list.add(n-(i+1));
    }
    Collections.sort(list);
    long b = N%2==0 ? list.get(N/2-1) : list.get(N/2);
    long ans = 0;
    for(int i = 0; i < N; i++){
      ans += A[i] - (b+i+1);
    }
    System.out.println(ans);
  }
}