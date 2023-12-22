import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = 0;

    while(!(a < b && b < c)){
      if(a > b){
        d = a;
        a = b;
        b = d;
      }
      if(b > c){
        d = c;
        c = b;
        b = d;
      }
    }
    System.out.println(a+" "+b+" "+c);
  }
}