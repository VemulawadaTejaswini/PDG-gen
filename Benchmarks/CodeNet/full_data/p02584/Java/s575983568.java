import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long X = sc.nextLong();
    Long K = sc.nextLong();
    Long D = sc.nextLong();
    // if(X>=0){
      Long A= X % D;
      Long B= X / D;
      if((K-B)%2==0){
        System.out.println(A);
      }else{
        System.out.println(Math.abs(A-D));
      }
    
    // }
  }
}

