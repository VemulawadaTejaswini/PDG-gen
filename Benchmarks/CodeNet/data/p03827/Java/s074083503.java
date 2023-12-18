import java.util.Scanner;
import java.lang.String;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String str = sc.next();
    int max = 0;
    int x = 0;
    for(int a=0;a<N;a++){
      if(str.startsWith("I")){
        x += 1;
        if(x>max){
          max = x;
        }
        str = str.substring(1,(N-a));
      }else{
        x -= 1;
      }
    }
    System.out.println(max);
  }
}