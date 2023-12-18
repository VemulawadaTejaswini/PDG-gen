import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 1; i < 10; i++){
      for(int o = 1; o < 10; o++){
        if( i * o == N ) {
          System.out.println("Yes");
          break
        }
          System.out.println("No");
      }
    }
  }
}
