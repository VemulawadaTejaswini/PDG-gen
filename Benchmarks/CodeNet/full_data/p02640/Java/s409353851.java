
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int x = sc.nextInt();
    static int y = sc.nextInt();

    public static void main(String[] args) {
        for(int i = 0; i <= x; i++){
            int j =  x - i;
            if(i * 2 + j * 4 == y){
                System.out.println("Yes");
                return;
            }
        }
            System.out.println("No");

    }
    
}