import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        for (int j =9; j > 6; j--) {
            System.out.println(n[j]);
        }
        
    }
}