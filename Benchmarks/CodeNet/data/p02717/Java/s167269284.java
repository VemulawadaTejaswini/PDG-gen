import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int x = a.nextInt();
    int y = a.nextInt();
    int c = a.nextInt();
  	x  = x-y;
    y = y+x;
    x = y-x;
    
    x = x - c;
    c = c+x;
    x = c-x;
    System.out.println(x + " "+ y + " " + c);
  }

}
