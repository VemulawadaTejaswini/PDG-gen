import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m;
    int f;
    int r;
    String result;
    while(true){
      m = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      int total = m + f;
      if(m == -1 && f == -1 && r == -1){
        break;
      }
      else if(m == -1 || f == -1){
        result = "F";
      }
      else if(total >= 80){
        result = "A";
      }
      else if(total < 80 && total >= 65){
        result = "B";
      }
      else if(total < 65 && total >= 50){
        result = "C";
      }
      else if(total < 50 && total >= 30){
        if(r >= 50){
          result = "C";
        }
        else{
          result = "D";
        }
      }
      else{
        result ="F";
      }
      System.out.println(result);
    }
  }
}

