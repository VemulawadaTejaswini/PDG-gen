import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 0;

    if(2 <= a && a <= 20 && 1<= b && b <= 20){

      for(int i = 1;;i++){

        if(i >= (double)b/(double)a){
          c = i;
          break;
        }

      }

    }

    System.out.println(c);

  }

}
