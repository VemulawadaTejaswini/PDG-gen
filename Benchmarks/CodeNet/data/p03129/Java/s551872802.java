import java.util.*;

class Main{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    if(N <= K){
      System.out.println("NO");

      return;
    }

    if((N / 2 + 1)>= K){
      System.out.println("YES");
      
    }else{
      System.out.println("NO");
    }
  }
}