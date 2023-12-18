import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int fatiga = 0;

        input.nextLine();
        int pueblos[] = new int[n];
        for (int i = 0; i < n; i++) {
            pueblos[i] = input.nextInt();
        }
        input.nextLine();

        for (int i = 0; i <n-1 ; i++) {
            if((pueblos[i+1]-pueblos[i])*a < b)
                fatiga += (pueblos[i+1]-pueblos[i])*a;
            else
                fatiga += b;

        }
        System.out.println(fatiga);

        }
}