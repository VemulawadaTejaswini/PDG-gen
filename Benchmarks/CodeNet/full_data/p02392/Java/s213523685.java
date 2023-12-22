import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a, b, c;

      a = s.nextInt();
      b = s.nextInt();
      c = s.nextInt();

      while(true){

      if(a < b){
        if(b < c){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }else{
          System.out.println("No");
      }
}
  }
}