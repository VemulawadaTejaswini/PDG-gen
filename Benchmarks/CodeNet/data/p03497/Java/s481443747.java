import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(num);
    
    List<Integer> list = new ArrayList<>();
    int a = num[0];
    int count = 1;
    for(int i = 1; i < N; i++){
      if(num[i] == a){
        count++;
      }else{
        list.add(count);
        a = num[i];
        count = 1;
      }
      
      if(i == N-1){
        list.add(count);
      }
    }
    Collections.sort(list);
    
    int M = list.size() - K;
    if(M < 0){
      M = 0;
    }
    
    int ans = 0;
    for(int i = 0; i < M; i++){
      ans += list.get(i);
    }
    System.out.println(ans);
  }
}