import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int ans = 0; 
    if(b - a - W > 0 ){
      ans = b-a-W;
    }else if(a - b - W > 0 ){
      ans = a-b-W;
    }else{
      ans = 0;
    }
    System.out.println(ans);
  }
}