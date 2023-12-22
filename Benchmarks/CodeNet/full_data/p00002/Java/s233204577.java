import java.util.Scanner;

class Main{
  public static void main(String[] args){
    String[] data;
    Scanner sc = new Scanner(System.in);
    data = sc.nextLine().split(" ");
    int digit = data[0].length() + data[1].length();

    System.out.println("" + digit);
  }
}