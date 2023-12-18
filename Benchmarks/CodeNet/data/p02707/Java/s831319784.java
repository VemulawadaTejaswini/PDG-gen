
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num + 1];
        int[] b = new int[num + 1];
        a[0] = 0;
        b[0] = 0;
        for (int i = 1; i <= num; i++){
            if (i == 1)
                a[i] = 0;
            else
                a[i] = sc.nextInt();
            b[i] = 0;
        }
        for (int i = 0; i <= num; i++){
            for (int j = 0; j <= num; j++){
                if (a[j] == i){
                    b[i] += 1;
                }
            }
        }
        for (int i = 1; i <= num; i++) {
            System.out.println(b[i]);
        }
    }
}
