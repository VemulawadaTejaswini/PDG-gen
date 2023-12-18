import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int an  = a*b*1;
      int ann = a*b*2;
      int annn = a*b*3;
      if((an%2!=0)&&an<10||(a*b*2%2!=0)&&ann<10||(a*b*3%2!=0)&&annn<10){
        System.out.print("Yes");
              System.exit(0);
      }
      System.out.println("No");
      }

  }