import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[4];
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            switch (sc.nextLine()) {
                case "AC":
                    num[0]++;
                    break;
                case "WA":
                    num[1]++;
                    break;
                case "TLE":
                    num[2]++;
                    break;
                case "RE":
                    num[3]++;
                    break;
            }
        }
        System.out.println("AC x " + num[0]);
        System.out.println("WA x " + num[1]);
        System.out.println("TLE x " + num[2]);
        System.out.println("RE x " + num[3]);
    }
}
