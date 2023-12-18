import java.util.Scanner;

 public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();            
        int res ;

        if (a<=5) {
        	res = 0;            	
        }else if (a<=12) {
        	res = b/2; 
        }else {
        	res = b;
        } 
      System.out.println(res);
    }
}
