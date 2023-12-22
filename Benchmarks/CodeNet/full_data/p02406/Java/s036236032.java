import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n;

    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    call(n);
  }

  private static void call(int n){
    for(int i=1; i<=n; i++){
        int x = i;
        if(x/10 > 0) x = x%10;
        if(x%3 == 0){
            System.out.print(" " + i);
        }
    }
    System.out.println();
  }
}