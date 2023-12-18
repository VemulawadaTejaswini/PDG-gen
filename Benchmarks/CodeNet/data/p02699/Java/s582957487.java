import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //Takahasi HP
        int b = scan.nextInt(); 
        int c = scan.nextInt(); //Aoki HP
        int d = scan.nextInt();
        scan. close();
        
        while(true){
            c -= b;
            if(c <= 0){
                System.out.print("Yes"); 
                break;
            }
            a -= d;
            if(a <= 0){
                System.out.println("No");
                break;
            }
        }
    }
}