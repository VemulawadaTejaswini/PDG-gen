import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    int y = sc.nextInt();
    
    if(y > x){
      System.out.println("unsafe");
    }else{
      System.out.println("safe");
    }
    
  }
}
