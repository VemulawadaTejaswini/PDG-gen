import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] str2 = str.split(" ");
      int x = 0;
      int a = Integer.parseInt(str2[0]);
      int b = Integer.parseInt(str2[1]);
      int c = Integer.parseInt(str2[2]);
      if (a <= b && b <= c){
        } else if (b > c){
          x = b;
          b = c;
          c = x;
        }
      } else if (a > b){
        x = a;
        a = b;
        b = x;
        if (b > c){
          x = b;
          b = c;
          c = x;
        }
      }
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(a + " " + b + " " + c);
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
