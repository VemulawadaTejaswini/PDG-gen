import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    for(int j = 0; j < k; j++){
      int a_ = a;
      int b_ = b;
      
      a = b + c;
      b = c + a_;
      c = a_ + b_;
    }
    
    if(a - b >= 0){
      if(a - b > 1E18)
        System.out.println("Unfair");
      else
        System.out.println(a - b);
    }
    else{
      if(b - a > 1E18)
        System.out.println("Unfair");
      else
        System.out.println(b - a);
    }
  }
}