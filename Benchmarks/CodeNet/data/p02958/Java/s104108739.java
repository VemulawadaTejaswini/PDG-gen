import java.util.Scanner;
import java.util.Arrays;
// Arrays.toString(array) 配列arrayの中身を出力する

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] p = new int[N];
    int cnt = 0;
    int temp1 = 0;
    int temp2 = 0;
    for(int i = 1; i <= N; i++){
      p[i-1] = Integer.parseInt(sc.next());
      if(p[i-1] != i){
        cnt += 1;

        if(cnt == 1){
          temp1 = i-1;
        }else if(cnt == 2){
          temp2 = i-1;
        }else{
          break;
        }

      }
    }

    if(cnt == 0){
      System.out.println("YES");
    }else if(cnt == 2){
      if(p[temp2] == temp1+1 && p[temp1] == temp2+1){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }else{
      System.out.println("NO");
    }
  }
}
