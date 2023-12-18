import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int total = 0;
    for (int i = 0 ; i < num ; i++){
      total += sc.nextInt();
    }
    if (total % 3 == 0) System.out.println("Yes");
    else System.out.println("No");
    sc.close();
  }
}
