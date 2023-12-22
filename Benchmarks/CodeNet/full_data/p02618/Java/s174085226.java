import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int d = sc.nextInt();
        for(int i = 1;i<=26;i++) {
            Random random = new Random();
            int randomValue = random.nextInt(26);
            System.out.println(randomValue+1);
        }
    }
}