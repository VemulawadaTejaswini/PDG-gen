import java.util.Scanner;
import java.util.Arrays;

class Ideone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = input.nextInt();
        }
        Arrays.sort(x);
        for (int i = 9; 6 < i; i--) {
            System.out.println(x[i]);
        }
    }
}