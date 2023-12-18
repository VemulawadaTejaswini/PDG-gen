import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s1 = sc.nextLine();
    int s2 = sc.nextLine();
    int count = 0;
    int sum = 1;
    While(s2<=sum){
      sum = (sum-1)+4;
      count++;
    }
      System.out.println(count);
  }
}
