import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int a = 1;
          while(a<=n){
             if(a%3 == 0||a%10 == 3){
        	     System.out.print(" "+a);
             }
             a=a+1;
          }
          System.out.println();
	}

}