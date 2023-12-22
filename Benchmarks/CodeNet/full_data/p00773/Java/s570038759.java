
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mae = scanner.nextInt();
        int ato = scanner.nextInt();
        int goukei = scanner.nextInt();
        int tuuka = 0;
        int zeikomi = 0;
        while (mae != 0 && ato != 0 && goukei != 0) {
            for (int syou = 1; syou < goukei; syou++) {
                for (int hinn = 1; hinn < goukei; hinn++) {
                    if ((syou * (100 + mae) / 100) + (hinn * (100 + mae) / 100) == goukei) {

                        tuuka = (syou * (100 + ato) / 100 + hinn * (100 + ato) / 100);
                        if (tuuka > zeikomi) {
                            zeikomi = tuuka;
                        }

                    }

                }
            }
            System.out.println(zeikomi);
            mae = scanner.nextInt();
            ato = scanner.nextInt();
            goukei = scanner.nextInt();
            zeikomi=0;
        }

    }
}

