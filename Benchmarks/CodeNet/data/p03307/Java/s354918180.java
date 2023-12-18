import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int n2 = n;

      for(int i = 0;i<=999999999;i++){
        if((n+i)%2==0&&(n+i)%n2==0){
          System.out.println(n+i);
          System.exit(0);
        }
      }


      }

  }