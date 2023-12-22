import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = in.nextInt();
      int b = 0;
      int over = -1;
      long limit = 1000000000000000000;
      
      for(int i=0;i<n-1; i++){
        if(a>=limit){
          System.out.println(over);
        }else{
          b = in.nextInt();
       	  a = a*b;
        }
      }
      System.out.println(a);
    }
}