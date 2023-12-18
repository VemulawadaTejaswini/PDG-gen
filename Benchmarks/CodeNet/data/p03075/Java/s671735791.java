import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(Math.abs(arr[i]-arr[j]) > k) {
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}
