import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inputNum;
        int countDup1 = 0;
        int countDup2 = 0;
        int countDup3 = 0;
        int countDup4 = 0;

        List<Integer> rute = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 6; i++) {
        try {
            inputNum = Integer.parseInt(scanner.next());
            if (inputNum < 1 || 4 < inputNum) {
                return;
            }

            if (rute.contains(inputNum) && inputNum == 1) {
                countDup1++;
            } else if (rute.contains(inputNum) && inputNum == 2) {
                countDup2++;
            } else if (rute.contains(inputNum) && inputNum == 3) {
                countDup3++;
            } else if (rute.contains(inputNum) && inputNum == 4) {
                countDup4++;
            }

            rute.add(inputNum);


        } catch (NumberFormatException e) {
            return;
        }

        }

        if (rute.contains(1) && rute.contains(2) && rute.contains(3) && rute.contains(4)) {
            if (countDup1 == 2 && countDup2 == 2) {
                System.out.println("YES");
            } else  if (countDup1 == 2 && countDup3 == 2) {
                System.out.println("YES");
            } else  if (countDup1 == 2 && countDup4 == 2) {
                System.out.println("YES");
            } else  if (countDup2 == 2 && countDup3 == 3) {
                System.out.println("YES");
            } else  if (countDup2 == 2 && countDup4 == 2) {
                System.out.println("YES");
            } else  if (countDup3 == 2 && countDup4 == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } 
    }
}
