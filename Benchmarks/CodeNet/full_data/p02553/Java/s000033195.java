import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
  
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int c = scanner.nextInt();
  int d = scanner.nextInt();
  
  if(a>=0 && b>=0 && c>=0 && d>=0){
      System.out.print(b*d);
  }else
  if(a<0 && b<0 && c<0 && d<0){
      System.out.print(a*c);
  }else{
      
      int max1 = Math.max(a*c,a*d);
      int max2 = Math.max(b*c,b*d);
      if(max1 >= max2){
          System.out.print(max1);
      }else{
          System.out.print(max2);
      }
  }
    }
}
