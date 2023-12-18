/*
全部でいくらかかるかは、各ピザの組み合わせによって決まる（値段が与えられているため）から、
単純に枚数の組み合わせを考えればよかった（枚数の樹形図書けばわかりやすかった）
*/

import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();
    /*int[] min1 = {x, 2*x};
    int[] min2 = {y, 2*y};
    int sum1 = 500000000;
    int sum2 = 500000000;*/
    long min = 500000000;

    /*
    for(int i = 0; i <=x; i++){
      for(int j = 0; j<=y; j++){
        int sum = a*i + b*j + c*2*Math.max(x-i, y-j);
        min = Math.min(sum, min);
      }
    }
    */

    for(long k = 0; k < 1000000000; k++){
      long sum = c*2*k + a*Math.max(x-k, 0) + b*Math.max(y-k, 0);
      min = Math.min(min, sum);
    }


    System.out.println(min);
    /*for(int i = 0; i <= x; i++){
      for(int j = 0; j <= 2*x; j++){
        if((a*i + c*j) < sum1 && i+(j/2) >=x){
          min1[0] = i;
          min1[1] = j;
          sum1 = a*i + c*j;
        }
      }
    }

    for(int i = 0; i <= y; i++){
      for(int j = 0; j <= 2*y; j++){
        if((b*i + c*j) < sum2 && i+(j/2) >=y){
          min2[0] = i;
          min2[1] = j;
          sum2 = b*i + c*j;
        }
      }
    }

    if(sum1+b*(y-min1[1]/2) > sum2+a*(x-min2[1]/2)){
      System.out.println(sum2+a*(x-min2[1]/2));
    }else{
      System.out.println(sum1+b*(y-min1[1]/2));
    }*/

  }
}
