import java.util.Scanner;

public class Main{
  public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = sc.nextInt();
    n++;
    System.out.println(n-i);
  }
}