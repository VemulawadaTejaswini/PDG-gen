import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int sum = 0;
            String num = scan.nextLine();
            for(int i = 0; i < num.length(); i++){
                sum += Character.digit(num.charAt(i), 10);
            }
            if ( sum == 0){
                break;
            }
            System.out.println(sum);


        }
    }
}
