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
      int      row    = 0;             //チェック値 横
      int      column = 0;			   //チェック値 縦
      String   jadge  = "No";          //判定
      
      for (int x=0; x<9; x++) {
      	for (int y=9; y<strs.size(); y++){
            bingo[x/3][x%3] = 0;
            //穴が開いた場合
            if (strs.get(x) == strs.get(y) ) {
	          bingo[x/3][x%3] = 1;
              break;
            }
        }
      }
      
      //ビンゴ有無チェック
      //横
      loop: for (int i=0; i<3; i++){
      	for(int j=0; j<3; j++){
          
          row += bingo[i][j];
          column += bingo[j][i];
          if (row == 3 || column ==3){
            jadge ="Yes";
            break loop;
          } 
        }
        row    = 0;
        column = 0;
      }
      
      //斜め
      if(bingo[0][0]+bingo[1][1]+bingo[2][2]==3){
        jadge = "Yes";
      }
      
      if(bingo[0][2]+bingo[1][1]+bingo[2][0]==3){
        jadge = "Yes";
      }
      
      System.out.println(jadge);
      
    } catch (Exception e) {
      
      System.out.println("error");

    }
  }
}
