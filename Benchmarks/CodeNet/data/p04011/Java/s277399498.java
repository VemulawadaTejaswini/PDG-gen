import java.util.*;

public class Main{

    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      int X = scan.nextInt();
      int Y = scan.nextInt();
      
      int Xvalue;
      int Yvalue;
      
      
      if (N > K){
        Xvalue = K * X;
        Yvalue = (N-K)*Y;
        System.out.print(Xvalue+Yvalue);
      }else{
        System.out.print(N*X);
      
      }
     
     
    
    }

}