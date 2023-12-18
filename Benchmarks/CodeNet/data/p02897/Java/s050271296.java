import java.util.Scanner;

 class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("1~100までの整数を入力してください:");
  float N = scanner.nextInt();
    if(N % 2 ==0) {
      System.out.println(1/2);
    }else{
      System.out.println(N-1/2/N);
    }
  }
  }