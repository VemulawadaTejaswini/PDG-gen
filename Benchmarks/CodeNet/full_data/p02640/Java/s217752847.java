import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int flag = 0;
    for (int i = 0; i <= x; i++){
      if ((y-2*i)%4 == 0 && (y - 2 * i)/4 == x-i){
        flag++;
        System.out.println("Yes");
        break;
      }
    }
    if  (flag == 0){
      System.out.println("No");
    }
  }
}