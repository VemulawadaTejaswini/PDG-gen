import java.util.*;

class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    class Inner{
      int inner(int x,int y){
        if(y == 0){
          return x;
        }else{
          return inner(y,x%y);
        }
      }
    }
    Inner in = new Inner();
    System.out.println(in.inner(x,y));
  }
}

