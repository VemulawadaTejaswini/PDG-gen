import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long[] num = new long[N];
    Set<Long> set = new HashSet<>();
    List<Long> list = new ArrayList<>();
    
    for(int i = 0; i < N; i++){
      long n = Long.parseLong(sc.next());
      num[i] = n;
      list.add(n);
    }
    
    String ans = "Yes";
    con : for(int i = 0; i < N-1; i++){
      for(int j = i+1; j< N; j++){
        long n = num[i]^num[j];
        if(list.contains(n)){
          list.remove(list.indexOf(n));
          continue con;
        }
      }
      ans = "No";
      break;
    }
    System.out.println(ans);
  }
}