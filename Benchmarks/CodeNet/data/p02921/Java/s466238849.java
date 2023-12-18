import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int count = 0;
    int sum = 1;
    do{
      sum = (sum-1)+s1;
      count++;
      System.out.println(sum);
      System.out.println(count);
    }while(sum<s2);
      System.out.println(count);
  }
}
