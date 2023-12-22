import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // 1st row
        int length = scanner.nextInt();

        // initial
        int max = -1000000;
        int min = 1000000;
        long total = 0;
        
        // 2st row split
        for (int i=0; i<length; i++) {
            int num = scanner.nextInt();
            
            // update max, min, total
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            total += num;
        }

        System.out.println(min + " " + max + " " + total);
    }
}
