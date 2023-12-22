import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String key = sc.next();
        
        String input = sc.next();
        while(! input.equals("END_OF_TEXT")) {
            if(input.equals(key)) 
                count++;
            input = sc.next();
        }
        System.out.println(count);
    }
}
