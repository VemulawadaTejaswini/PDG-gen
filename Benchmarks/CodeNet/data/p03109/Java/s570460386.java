
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.next();

        int[] ints = Arrays.stream(inputText.split("/")).mapToInt(Integer::parseInt).toArray();
        int month = ints[1];
        
        if(month <= 4){
            System.out.println("Heisei");
        }else {
            System.out.println("TBD");
        }
    }
}