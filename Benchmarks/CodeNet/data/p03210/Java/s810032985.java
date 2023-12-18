import java.util.Scanner;
2
​
3
public class Main{
4
  public static void main(String[] args){
5
    Scanner sc = new Scanner(System.in);
6
    int an = sc.nextInt();
7
    System.out.println((an==3|an==5|an==7) ? "Yes":"No");
8
  }
9
}