import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    char c;
    x = sc.nextInt();
    c = sc.nextChar();
    y = sc.nextInt();
    if(c == "+"){
      System.out.println(x+y);
    }
    else{
      System.out.println(x-y);
    }
  }
}