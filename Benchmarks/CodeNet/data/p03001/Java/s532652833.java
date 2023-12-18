import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.next();
    int h = sc.next();
    int x = sc.next();
    int y = sc.next();
    int b = 0;
    double a = ((double)w * (double)h) / 2;
    if(w / 2 == x && h / 2 == y){
      b = 1;
    }
   
    System.out.println(a + " " + b);
  }
}