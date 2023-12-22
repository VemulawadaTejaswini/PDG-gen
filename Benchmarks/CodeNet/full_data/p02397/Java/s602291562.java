import java.util.Scanner;                                                   
import java.util.Arrays;
   
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
      
        while(true) {
            if(x == 0 && y == 0)
                break;
            else if(x < y) {
                System.out.println(data[0] + " " + data[1]);
            } else {
                System.out.println(data[1] + " " + data[0]);
            } 
        } 
    } 
}