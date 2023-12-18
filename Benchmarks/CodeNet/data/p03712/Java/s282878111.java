import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int H = sc.nextInt();
    int W = sc.nextInt();
 
    for(int i = 0; i <= W+1; i++) {
        System.out.print("#");
    }
    System.out.println("#");
 
    for(int j = 0; j <= H; j++) {
        System.out.print("#");
       String a = sc.next();
        System.out.print(a);
    }
        System.out.println("#");
 
     for(int i = 0; i <= W+1; i++) {
        System.out.print("#");
    }
        System.out.println("#");
  }
}