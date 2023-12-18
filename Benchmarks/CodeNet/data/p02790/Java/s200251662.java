import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int l;
    int s;
    if ( a > b ) { l = a; s = b; } 
    else { s = a; l = b; }
    for (int i = 0; i < l; i++) {
    System.out.print(s);
    }
  }
}