import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        int taro = 0;
        int hanako = 0;
        for (int i = 0; i < n; i++) {
            String TS = sc.next();
            String HS = sc.next();

            if (TS.compareTo(HS) > 0) {
                taro += 3;
            } else if (TS.compareTo(HS) < 0){
                hanako += 3;
            } else if (TS.compareTo(HS) == 0) {
                taro++;
                hanako++;
            }
        }
        System.out.printf("%d %d\n", taro, hanako);
    }
}