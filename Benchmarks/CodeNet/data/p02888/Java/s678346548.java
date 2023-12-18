import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 棒の本数取得
    int rodCnt = scanner.nextInt();
    
    // 棒のパラメータ設定
    List<Integer> rodList = new ArrayList<Integer>();
    for(int i = 1; i <= rodCnt; i++){
      rodList.add(scanner.nextInt());
    }
    
    // 棒の組み合わせから、パターン数をカウントする
    int cnt = 0;
    for(int a = 0; a <= rodList.size() - 1; a++){
      for(int b = a + 1; b <= rodList.size() - 1; b++){
        for(int c = b + 1; c <= rodList.size() - 1; c++){
          if(rodList.get(a) < rodList.get(b) + rodList.get(c) && 
             rodList.get(b) < rodList.get(a) + rodList.get(c) && 
             rodList.get(c) < rodList.get(a) + rodList.get(b)){
            cnt += 1;
          }
        }
      }
    }
    System.out.println(cnt);
  }

}