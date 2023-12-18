import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();

    for(int i = 0;i < b;i++){

      if(i >= b/a){
        System.out.println(i);
        break;
      }

    }

  }
}
