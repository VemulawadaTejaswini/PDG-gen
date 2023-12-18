import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
 
        int a = scan.nextInt();
        int b = scan.nextInt();
 
        int c = a + b;
        int d = a - b;
        int e = a * b;
 
        if(c > d){
            if(c > e){
                System.out.print(c);
                System.exit(0);
            }
            System.out.print(e);
            System.exit(0);
        }
 		if(d > e){
        	System.out.print(d);
          	System.exit(0);
        }
      	System.out.print(e);
    }
}