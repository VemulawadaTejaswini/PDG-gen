import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int tmp = 0;
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    for(int i = 0;i < N;i++){
      int X = scan.nextInt();
      tmp+=(int)Math.pow(X-N,2);
    }
    System.out.printf("%d\n",tmp);
  }
}