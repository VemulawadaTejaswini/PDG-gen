import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();
    int n = 0;
    
    for(int i=a; i<=t+0.5; i += a){
      n += b;
    }
    
    System.out.println(n);
  }
}