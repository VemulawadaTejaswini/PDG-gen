import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    int check = 0;
    int a = 0;
    int b = 0;
    int m1 = 0;
    int c = 0;
    int d = 0;
    int m2 = 0;

    a = x * H;
    b = W * H - a;
    if (a < b){
      m1 = a;
    } else {
      m1 = b;
    }
    
    c = y * W;
    d = W * H - c;
    if (c < d){
      m2 = c;
    } else {
      m2 = d;
    }

    if (m1 < m2){
      if (c == d){
        check = 1;
      }
      System.out.println(m2 + " " + check);
    } else {
      if (a == b){
        check = 1;
      }
      System.out.println(m1 + " " + check);
    }

  }