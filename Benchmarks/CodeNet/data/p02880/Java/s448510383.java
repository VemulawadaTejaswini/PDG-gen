import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();

      for(int i = 1;i<10;i++){
        for(int j = 1;j<10;j++){
          if(N==i*j){
            System.out.println("Yes");
            break;
          }
        }
      }
      System.out.println("No");


                   }
}