import java.util.*;

public class Main{

    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      int X = scan.nextInt();
      int Y = scan.nextInt();
      
      int Xvalue = K * X;
      int Yvalue = (N-K)*Y;
      
      int Sumvalue = Xvalue + Yvalue;
      System.out.print(Sumvalue);
    
    
    }

}