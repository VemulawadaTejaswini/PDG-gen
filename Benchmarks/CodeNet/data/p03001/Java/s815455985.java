import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int b = 0;
    double a = ((double)w * (double)h) / 2;
    if(w / 2 == x && h / 2 == y){
      b = 1;
    }
   
    System.out.println(a + " " + b);
  }
}