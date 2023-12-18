import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y,z,n;
    x = sc.nextInt();
    y = sc.nextInt();
    z = sc.nextInt();
    n = y/x;
    if(n<z){
      System.out.println(n);
    }
    else{
      System.out.println(z);
    }
  }
}