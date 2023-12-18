import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.next();
          String[] str2 = str.split("");
          int number = Integer.parseInt(str);
          int count = 0;
          int num2 = 0;
          for(int i = 0; i < str.length(); i++){
            for(int j = 1; i < str.length(); i++) {
              num2 = Integer.parseInt(str.substring(i, j));
          if( num2 % 2019 == 0){
            count++;
          }
        }
      }
      System.out.println(count);
          }
        }
