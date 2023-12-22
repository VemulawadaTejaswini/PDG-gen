import java.util.Scanner;

class Main {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    
    while(in.hasNext()){
      int sum = 0;
      String input = in.next();
      if (input.equals("0")) break;
      for (int i = 0; i < input.length(); i++) sum += input.charAt(i) - '0';
      System.out.println(sum);
    }
  }
}