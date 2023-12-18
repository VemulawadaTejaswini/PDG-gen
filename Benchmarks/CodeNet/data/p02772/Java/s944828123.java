import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_text = scanner.nextLine();
        input_text = scanner.nextLine();
        String[] data = input_text.split(" ");
        scanner.close();
        for(int i = 0; i < data.length; i++) {
            int n = Integer.parseInt(data[i]);
            if(n % 2 == 0) {
                if(n % 3 != 0 && n % 5 != 0) {
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        System.out.println("APPROVED");
    }

}