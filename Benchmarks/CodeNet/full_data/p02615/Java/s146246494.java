import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      List<Integer> A = new ArrayList<>();
      for(int i = 0; i < N; i++){
        A.add(sc.nextInt());
      }
      Collections.sort(A);
      Collections.reverse(A);
      
      // 心地よさの計算
      int comfort = A.get(0);
      for(int i = 2; i < N; i++){
        int a = A.get(i-2);
        int b = A.get(i-1);
        if(a < b){
          comfort += a;
        }else{
          comfort += b;
        }
        //System.out.println(comfort);
      }
      
      
      // 出力
      System.out.println(comfort);
    }
    

}