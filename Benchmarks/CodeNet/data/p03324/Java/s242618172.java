import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int D;
    int N;

    Scanner sc = new Scanner(System.in);

    D = sc.nextInt();
    N = sc.nextInt();

    int q = (N-1)/99;

    System.out.println((N-q)*Math.pow(100,D));
  }
}
