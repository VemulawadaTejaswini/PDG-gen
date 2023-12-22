import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.next());
        int taroScore = 0, hanakoScore = 0;

        for (int i = 0; i < num; i++) {
            String taroS = scan.next(), hanakoS = scan.next();
            int comp = taroS.compareTo(hanakoS);

            if (comp > 0) {
                taroScore += 3;
            } else if (comp < 0) {
                hanakoScore += 3;
            } else {
                taroScore++;
                hanakoScore++;
            }
        }

        System.out.println(taroScore + " " + hanakoScore);
    }
}

