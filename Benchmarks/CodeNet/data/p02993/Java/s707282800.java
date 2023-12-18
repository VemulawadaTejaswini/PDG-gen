import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    if(scan.next().chars()
           .mapToObj(i -> (char)i)
           .distinct()
           .count() == 4){
      System.out.println("Good");
           }else{
      System.out.println("Bad");
           }
  }
}