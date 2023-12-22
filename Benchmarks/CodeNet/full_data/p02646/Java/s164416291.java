import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int aPos = sc.nextInt();
    int aSpeed = sc.nextInt();
    int bPos = sc.nextInt();
    int bSpeed = sc.nextInt();
    int time = sc.nextInt();

    int diffSpeed = aSpeed - bSpeed; //if +, a is faster; if - b is faster
    int diffPos = Math.abs( aPos - bPos );

    if( diffSpeed <= 0 ){
      System.out.println("NO");
    }else{
      if( (diffSpeed * time) >= diffPos ){
        System.out.println("YES");
      }
    }

  }
}
