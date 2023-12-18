import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int b = 500;
    int c = 500;
    for(int i = a-1; i > 0; i--){
      if(a % i == 0){
        if((a/i + i) < (b + c) ){
        b = a/i;
        c = i;
        }
      }
    }

    System.out.println(b + c);
  }
}