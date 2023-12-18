import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    
    int x = 0, y = 0, a = 0;
    int x1 = 0, y1 = 0;
    int x2 = W, y2 = H;
    
    for(int i = 0; i < N ; i++){
      x = sc.nextInt();
      y = sc.nextInt();
      a = sc.nextInt();
      
      if(a==1){
        x1 = Math.max(x1,x);
      }else if(a==2){
        x2 =Math.min(x2,x);
      }else if(a==3){
        y1 = Math.max(y1,y);
      }else if(a==4){
        y2 = Math.min(y2,y);
      }
    }
    System.out.println(Math.max((x2-x1),0)*Math.max((y2-y1),0));
  }
}