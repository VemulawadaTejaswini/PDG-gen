import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int m = input.nextInt(); //中間
            int f = input.nextInt(); //期末
            int r = input.nextInt(); //再試験
            if (m == -1 && f == -1 && r == -1) break;
            
            char result;
            if (m == -1 || f == -1) result = 'F';
            else if (m + f >= 80) result = 'A';
            else if (m + f >= 65) result = 'B';
            else if (m + f >= 50) result = 'C';
            else if (m + f >= 30) {
                if (r >= 50) result = 'C';
                else result = 'D';
            } else result = 'F';
            
            System.out.println(result);
        }
    }
}