import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countRain = 0;
        String[] weather = sc.next().split("");
        boolean yesterdayIsRain = false;
        sc.close();

        for (String we : weather) {
            if ("R".equals(we)) {
                if (yesterdayIsRain) {
                    countRain++;

                } else {
                    countRain = 1;
                }
                yesterdayIsRain = true;
            } else {
                yesterdayIsRain = false;
            }
        }
        System.out.println(countRain);
    }
}