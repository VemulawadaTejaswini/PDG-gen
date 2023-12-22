import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++) {
            int sum = 0;
            int x = sc.nextInt();
            if(x == 0) break;
            String str = String.valueOf(x);
            String[] a = str.split("");
            for(int j = 0; j < a.length; j++) {
                sum += Integer.parseInt(a[j]);
            }
            System.out.println(sum);
        }
    }
}
