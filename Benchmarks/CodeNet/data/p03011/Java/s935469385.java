

    AtCoder Beginner Contest 142

    日本語
    xxJOKERxx (Guest)

コンテスト時間: 2019-09-28(土) 21:00 ~ 2019-09-28(土) 22:40 (100分)
AtCoderホームへ戻る

    トップ
    問題
    質問
    提出
    提出結果
    順位表
    バーチャル順位表
    コードテスト
    解説

コードテスト
言語
ソースコード

1

import java.util.*;

2

​

3

public class Main{

4

      public static void main(String[] args) {

5

            Scanner sc = new Scanner(System.in);

6

            int x = sc.nextInt();

7

            int y = sc.nextInt();

8

            int z = sc.nextInt();

9

            if(x > y || x > z){

10

              System.out.println(y + z);

11

            } else if(y > x || y > z){

12

              System.out.println(x + z);

13

            } else {