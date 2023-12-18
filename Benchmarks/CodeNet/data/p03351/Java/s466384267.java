import java.util.Scanner;

class Main {
  public static void main(String args[]){
    System.out.println("値を入力してください");

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    if(a-c <= d && a-c >= -d){
      System.out.println("Yes");
    }else if(a-b <= d && a-b >= -d){
      if (b-c <= d && b-c >= -d) {
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
    return;

  }
}
