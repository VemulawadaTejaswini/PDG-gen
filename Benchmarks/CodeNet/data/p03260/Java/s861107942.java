
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a%2==0 ||b%2==0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}