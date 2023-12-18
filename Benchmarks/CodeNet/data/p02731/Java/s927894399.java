import java.util.*;
public class Main {
        public static void main(String args[]){
          
        Scanner sc = new Scanner(System.in);
          
          //入力
          long L = sc.nextLong();
          
          double M = L/3;
          
          //直方体の体積
          System.out.println(M*M*M);
        }
}