import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> prize = new ArrayList<String>();
        int times = scanner.nextInt();

        for(int i = 0; i < times; i++) {
            String str = scanner.next();

            if(!prize.contains(str)) {
                prize.add(str);
            }
        }
    System.out.println(prize.size());
    }
}