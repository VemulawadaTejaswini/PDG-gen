import java.util.*;

class a{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    if(N <= K){
      System.out.println("NO");
      return;
    }

    System.out.println("YES");
    
  }
}