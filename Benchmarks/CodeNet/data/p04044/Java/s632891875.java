import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        String a[] = new String[n];

        for(int i = 0; i < n ;i++){
            a[i] = scan.next();
        }

        Arrays.sort(a);

        String res = "";

        for(int i = 0; i < n ;i++){
            res += a[i];
        }

        System.out.println(res);


    }
}
