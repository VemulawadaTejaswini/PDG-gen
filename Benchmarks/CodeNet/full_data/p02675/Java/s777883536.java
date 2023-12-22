import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int num = scan.nextInt();
        int mod = num % 10;
        
		if ( (mod == 2) || (mod == 4) || (mod == 5) || (mod == 7) || (mod == 9) ) {
		    System.out.println("hon");	
		}
        else if ( mod == 0 ||  mod == 1 ||  mod == 6 ||  mod == 8 ) {
            System.out.println("pon");
        }
        else {
            System.out.println("bon");
        }
        scan.close();
    }
}
