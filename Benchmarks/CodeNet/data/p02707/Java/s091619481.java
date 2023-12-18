import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
      for(int i=1; i<=N; i++){
        list = list.add(0);
      }
        for(int i=1; i<N; i++){
          int Ai = sc.nextInt();
          list[i-1] += 1;
        }
      for(int i=0; i<=N; i++){
      System.out.println(list.get(N));
      }
    }
}