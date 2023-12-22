import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();
    String[] input = line.split(" ");
    try{
      int x = Integer.parseInt(input[0]);
      int y = Integer.parseInt(input[1]);
      if(x < y){
        int temp = x;
        x = y;
        y = temp;
      }
      while(y != 0){
        int temp = x;
        x = y;
        y = temp % y;
      }
      System.out.println(x);
    }catch(NumberFormatException nfe){
      System.out.println("数字が有効範囲を外れています．有効範囲：1 <= num <= 1,000,000,000");
    }
  }
}

