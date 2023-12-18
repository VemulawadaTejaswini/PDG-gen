import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int page = N;
    page = (int)Math.ceil((double)page / 2);
    System.out.print(page);
}
}