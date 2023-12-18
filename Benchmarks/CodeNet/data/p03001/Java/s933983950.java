import java.util.*;
 
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    double ans,x2,y2;
    int boo=0;
    
    if(x > w/2) x2 = w-x;
    else x2 = x;
    
    if(y > h/2) y2 = h-y;
    else y2 = y;
    
    if(x2*h > w*y2) ans = x2*h;
    else if(x2*h < w*y2) ans = w*y2;
    else{
      ans = x2*h;
      boo = 1;
    }
    System.out.println(ans+" "+boo);
  }
}