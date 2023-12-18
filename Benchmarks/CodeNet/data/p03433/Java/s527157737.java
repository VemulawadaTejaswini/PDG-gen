import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    n /= 500;
    if(a>=n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
