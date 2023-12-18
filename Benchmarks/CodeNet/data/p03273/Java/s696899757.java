//https://qiita.com/wing-x/items/187e988125a3bd7b2b32
/*
"2 5\n"と入力するとsc.nextInt()は2, 5のみを読み取り、scに\nが残る.
nextLint()はその\nを読み取るから、実質的にnextLine()を5本用意しても
文字列入力を受け付けるのは4本になってしまう.
よって, \nを片付けるためにblankを使う
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String blank = sc.nextLine();
    char[][] array1 = new char[h][w];
    List<Integer> arylist = new ArrayList<>();

    for(int i = 0; i < h; i++){
      String s = sc.nextLine();
      array1[i] = s.toCharArray();
    }

    for(int i = 0; i < h; i++){
      boolean flag = true;
      char standard = 's';
      for(int j = 0; j < w; j++){
        if(j == 0){
          standard = array1[i][j];
          if(standard != '.'){
            flag = false;
            break;
          }
        }
        else if(standard != array1[i][j]){
          flag = false;
          break;
        }
      }
      if(flag == false){
        arylist.add(i);
      }
    }
    //System.out.println(arylist.size());


    char[][] array2 = new char[w][arylist.size()];
    for(int i = 0; i < w; i++){
      for(int j = 0; j < arylist.size(); j++){
        char tmp = array1[arylist.get(j)][i];
        array2[i][j] = tmp;
      }
    }

    /*for(int i = 0; i < w; i++){
      for(int j = 0; j < arylist.size(); j++){
        System.out.print(array2[i][j]);
      }
      System.out.println("");

    }*/

    //System.out.println("/////////////////");

    int size = arylist.size();
    arylist.clear();
    for(int i = 0; i < w; i++){
      boolean flag = true;
      char standard = 's';
      for(int j = 0; j < size; j++){
        if(j == 0){
          standard = array2[i][j];
          if(standard != '.'){
            flag = false;
            break;
          }
        }
        else if(standard != array2[i][j]){
          flag = false;
          break;
        }
      }
      if(flag == false){
        arylist.add(i);
      }
    }

    char[][] array3 = new char[size][arylist.size()];
    for(int i = 0; i < size; i++){
      for(int j = 0; j < arylist.size(); j++){
        char tmp = array2[arylist.get(j)][i];
        array3[i][j] = tmp;
        System.out.print(array3[i][j]);
      }
      System.out.println("");
    }


  }
}

