import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] aArray = new int[n];

        for (int i = 0; i < n; i++) {
            aArray[i] = sc.nextInt();
        }

        int[] hyoten = new int [n - k + 1];

        for (int i = 0; i < n - k + 1; i++) {
            hyoten[i] = 1;
            for (int j = i; j < k + i; j++) {
                hyoten[i] *= aArray[j];
            }
        }

        for (int i = 0; i < hyoten.length; i++) {
            if (i == 0) {
                continue;
            }
            if (hyoten[i - 1] < hyoten[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}