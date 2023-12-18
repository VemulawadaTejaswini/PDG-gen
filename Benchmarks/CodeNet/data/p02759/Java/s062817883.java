import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  
  public static void main(String[] args){
    
    try {
      
      //標準入力受け取り
      Scanner scan            = new Scanner(System.in);
      ArrayList<Integer> strs = new ArrayList<Integer>();
      
      while (scan.hasNext()){
      	strs.add(scan.nextInt());
      }
      
      //変数へ代入
      int [][] bingo  = new int[3][3]; //ビンゴ表
      int      num    = 0;             //チェック値
      String   jadge  = "No";          //判定
      
      for (int x=0; x<9; x++) {
      	for (int y=9; y<strs.size(); y++){
          bingo[x/3][x%3] = 0;
          //穴が開いた場合
          if (strs.get(x) == strs.get(y) ) {
	    	bingo[x/3][x%3] = 1;
          }                 
        }
      }
      
      //ビンゴ有無チェック
      loop: for (int i=0; i<3; i++){
      	for(int j=0; j<3; j++){
          
          num += bingo[i][j];
          if (num == 3){
            jadge ="Yes";
            break loop;
          }
        }
        num = 0;
      }
      
      num = bingo[0][0]+bingo[1][1]+bingo[2][2];
      if(num==3){
        jadge = "Yes";
      }
      
      num = bingo[0][2]+bingo[2][2]+bingo[0][2];
      if(num==3){
        jadge = "Yes";
      }
      
      System.out.println(jadge);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}
