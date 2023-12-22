import java.util.Scanner;
public class Main {
  public static void main(final String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x = scan.nextInt();
    int t = scan.nextInt();
    int count = 0;
   
    while(n>0){
      n = n - x;
      count++;
    }
    System.out.println(t*count);
  }
}