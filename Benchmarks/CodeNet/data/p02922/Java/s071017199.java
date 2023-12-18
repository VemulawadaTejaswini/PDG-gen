import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double c;

    for(int i = 0;i < b;i++){

      c = (double)b/(double)a;

      if(i >= c){
        System.out.println(i);
        break;
      }

    }

  }
}
