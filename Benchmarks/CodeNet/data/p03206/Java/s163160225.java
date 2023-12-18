import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int explosion = scan.nextInt();
        System.out.print("Christmas");
        while(explosion<25){
            System.out.print(" Eve");
            explosion++;
        }
        System.out.println("");
    }
}
