
import java.util.Scanner;


public class tanvir1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if((n*a)<= b){
            System.out.println(n*a);
        }
        else{
            System.out.println(b);
        }
    }
    
}
