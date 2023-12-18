import java.util.Scanner;

 


public class Main {
        public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
         
          String s = sc.next(); // こいつにはsnukeが入る
          String t = sc.next(); // こいつにはsnekeeが入る
          
          // ここまではこれでおっけ
         
         // s = s.substring(s.length() -1); こう書いてるけど
         
         String T1 = t.substring(s.length() - 0); // こう書いたらｔの末尾一文字だけを取り出せる

 

           if(t.equals(s+T1)) //あとはTとs+T1が同じだったらみたいな感じの条件式にする
           {
             System.out.println("Yes");
           }
        else{
           System.out.println("No");
            }
         }
      }