import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a , b, c, d;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    while(a >= 0 || c >= 0){
      c = c - b;
      if(c <= 0){
        break;
      }
      a = a - d;
    }
    if(a > 0 && c <= 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
