import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n <= 5){
      System.out.println(n);
      System.exit(0);
    }
    int x = 0;
    int nine = 9;
    int six = 6;

    while(n > 5){
      nine = 9;
      six = 6;
      while(nine < n){
        nine *= 9;
      }
      while(six < n){
        six *= 6;
      }
      nine /= 9;
      six /= 6;
      if(six < nine && (n - nine < 3 || n - nine > 5)){
        n -= nine;
        x++;
      }else{
        n -= six;
        x++;
      }
    }

    x += n;
    System.out.println(x);
  }
}
