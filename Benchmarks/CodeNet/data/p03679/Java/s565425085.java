import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(b<=a){
        System.out.println("delicious");
      }
      if((a<=b)&&(a+x>=b)){
        System.out.println("safe");
      }else if(a+x<b){
        System.out.println("dangerous");
  }
}
}