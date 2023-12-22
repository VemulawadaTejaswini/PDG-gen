import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int x = sc.nextInt();
    int y = sc.nextInt();

    //output
    //lowest x*2, highest x*4
    if( y < x*2 || y > x*4 ){
      System.out.println("No");
    }else{ //by adding 1 turtle you are adding 2 legs, must be even
      if( y%2 == 0 ){ //if even
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }

  }
}
