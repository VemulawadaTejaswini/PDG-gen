import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//くじ引き回数
      String item[] = new String[N];
      int count =1;
      
      
      //景品を配列へ
      for(int i =0; i<N; i++){
      	item[i] = sc.next();
      }
      
      //景品を昇順に並び替え
      Arrays.sort(item);
      
      //景品が被っていたらカウント
      for(int i =0; i<N-1; i++){
        if(!item[i].equals(item[i+1])){
          count++;
        }
      }
      System.out.println(count);
    }
}     