import java.util.*;
     
public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] str = input.split(" ");
    int in1 = Integer.parseInt(str[0]);
    int in2 = Integer.parseInt(str[1]);
     
    System.out.println(in1*in2+" "+(in1+in2)*2);
  }
}