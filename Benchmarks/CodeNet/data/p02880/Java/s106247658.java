import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count = 0;
    loop: for (int b=1;b<10;b++){
      for (int c = 1;c<10;c++){
        if (a == b*c){
          count =count +1;
          System.out.println("Yes");
          break loop;
        }
      }
    }
    }
  }
}