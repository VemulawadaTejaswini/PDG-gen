import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      Long[] p = new Long[A];
      for(int i = 0; i < A; i++){
        p[i] = sc.nextLong();
      }
      Long[] q = new Long[B];
      for(int i = 0; i < B; i++){
        q[i] = sc.nextLong();
      }
      Long[] r = new Long[C];
      for(int i = 0; i < C; i++){
        r[i] = sc.nextLong();
      }
      
      // ソート
      Arrays.sort(p, Collections.reverseOrder());
      Arrays.sort(q, Collections.reverseOrder());
      Arrays.sort(r, Collections.reverseOrder());
      
      // りんご集約
      Long[] apple = new Long[X+Y+C];
      for(int i = 0; i < X; i++){
        apple[i] = p[i];
      }
      for(int i = 0; i < Y; i++){
        apple[X+i] = q[i];
      }
      for(int i = 0; i < C; i++){
        apple[X+Y+i] = r[i];
      }
      Arrays.sort(apple, Collections.reverseOrder());
      
      // 美味しさ計算
      int result = 0;
      for(int i = 0; i < X+Y; i++){
        result += apple[i];
      }
      
      // 出力
      System.out.println(result);
    }
    


}