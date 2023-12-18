/*
文字列中の文字を昇順に並び替える×
並び替えた文字列の文字をSetに入れることで重複なしにできる
・・・
*/
//setはStringクラスでなくともchar型をCharacterとして使える

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //String s = sc.nextLine();
      //何文字の文字列か分かってないときに便利。
      char[] S = sc.next().toCharArray();
      //Set<String> d = new HashSet<String>();
      Set<Character> d = new HashSet<Character>();


      for(char c : S){d.add(c);}
      //Set<String> d = new HashSet<String>();
      /*for(int i = 0; i < s.length(); i++){
        //char型からStringクラスへの変換
        d.add(valueOf(s[i]));
      }*/
      for(char i = 'a'; i <= 'z'; i++){
        if(!d.contains(i)){
          System.out.println(i);
          return;
        }
      }

      System.out.println("None");

      /*println(c+1)とすると, 数値で優先？されて98(=b)が出る
      char c = 'a';
      c += 1;
      System.out.println(c);
      */
      /*if(d.size() == 26)
        System.out.println("None");
      else{

      }
      */
    }
  }
