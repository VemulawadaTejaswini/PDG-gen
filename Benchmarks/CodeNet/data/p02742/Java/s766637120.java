import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long width = w-w%2;
    long last = h/2 + h%2;
    System.out.print(h*width/2+last*(w%2));
  }
}