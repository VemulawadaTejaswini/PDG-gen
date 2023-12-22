import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            char[] cs = input.nextLine().toCharArray();
            if (cs.length <= 0 || cs[0] == '0') break;
            int sum = 0;
            for (int i = 0; i < cs.length; i++) sum += cs[i] - '0';
            System.out.println(sum);
        }
    }
}