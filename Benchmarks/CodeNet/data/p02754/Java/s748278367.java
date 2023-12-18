import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
        
    if(a>n){
      System.out.println(n);
      return;
    }
    
    int o = n/(a+b);
    o = o*a;
    int nokori = n % (a+b);

    
    if(nokori >=a)
      o += a;
    else
      o += nokori;
      
    System.out.println(o);
  }
}