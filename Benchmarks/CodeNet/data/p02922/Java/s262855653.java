import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int i,j,x;
      
      Scanner sc = new Scanner(System.in);
      i = sc.nextInt(); //型を指定しなくてもいい
      j = sc.nextInt(); //型を指定しなくてもいい
      
      System.out.println(i+" , "+j);
      
      if ( i == j ) {
          x = 1;
      } else {
          x = (j-i)/(i-1)+1;
        }

      System.out.println(x);
            
    }

}