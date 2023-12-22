

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int n = scanner.nextInt();
            if (n==0) break;
            scanner.nextLine();
            int countLunch = 0, countDinner = 0, countMidnight = 0;
            int countOkLunch = 0, countOkDinner = 0, countOkMidnight = 0;
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                int h = Integer.parseInt(s.substring(0, 2));
                int m = Integer.parseInt(s.substring(3, 5));
                int m1 = Integer.parseInt(s.substring(6, 8));

                if (m1 < m) {
                    m1 += 60;
                }

                boolean checkShorter = m1 - m <= 8;
                if (11 <= h && h < 15) {
                    countLunch++;
                    if (checkShorter) {
                        countOkLunch++;
                    }
                } else if (18 <= h && h < 21) {
                    countDinner++;
                    if (checkShorter) {
                        countOkDinner++;
                    }
                } else if (21 <= h || h < 2) {
                    countMidnight++;
                    if (checkShorter) {
                        countOkMidnight++;
                    }
                }
            }


            if (countLunch == 0) {
                System.out.println("lunch no guest");
            } else {
                System.out.println("lunch " +  countOkLunch * 100 / countLunch);
            }
            if (countDinner == 0) {
                System.out.println("dinner no guest");
            } else {
                System.out.println("dinner " +  countOkDinner * 100 / countDinner);
            }

            if (countMidnight == 0) {
                System.out.println("midnight no guest");
            } else {
                System.out.println("midnight " +  countOkMidnight * 100 / countMidnight);
            }


        }
    }
}

