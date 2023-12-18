import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] number = new String[n];
        int value = 0;
        
        for (int i = 0; i < n; i++) {
            number[i] = String.valueOf(i + 1);
        }
        
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(number[i]) % 3 == 0 && Integer.parseInt(number[i]) % 5 == 0) {
                number[i] = "FizzBuzz";
            } else if (Integer.parseInt(number[i]) % 3 == 0) {
                number[i] = "Fizz";
            } else if (Integer.parseInt(number[i]) % 5 == 0) {
                number[i] = "Buzz";
            } else {
                value += Integer.parseInt(number[i]);
            }
        }
        
        System.out.println(value);
    }
}
