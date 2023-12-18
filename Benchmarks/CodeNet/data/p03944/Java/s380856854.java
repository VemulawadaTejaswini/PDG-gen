import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    //整数の入力
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    int x, y, a;

    int max_x = 0;
    int min_x = W;
    int max_y = 0;
    int min_y = H;

    //繰り返し処理
    for(int i=0; i< N; i++){
      x = sc.nextInt();
      y = sc.nextInt();
      a = sc.nextInt();

      switch(a){
        case 1:
        if(max_x < x)max_x = x;
        break;

        case 2:
        if(min_x > x)min_x = x;
        break;

        case 3:
        if(max_y < y)max_y = y;
        break;

        case 4:
        if(min_y > y)min_y = y;
        break;
      }
    }

    //面積を求める
    if( (max_x >= min_x) || (max_y >= min_y) ){
      System.out.println(0);
    }else{
      int ans = (min_x - max_x)*(min_y - max_y);
      System.out.println(ans);

    }



  }
}
