import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cellNum = scanner.nextInt();
        int cells[] = new int[cellNum];
        boolean reslt = true;

        for (int i = 0; i < cellNum; i++) {
            cells[i] = scanner.nextInt();
        }

        int nextNum = 0;
        for (int i = cellNum; 0 < i; i--) {
            if (cellNum == i) {
                nextNum = cells[i - 1];
                continue;
            }
            int num = cells[i - 1];
            if (num - nextNum > 1) {
                reslt = false;
                break;
            } else if (num - nextNum == 1) {
                nextNum = num - 1;
            } else {
                nextNum = num;
            }
        }

        System.out.println(reslt? "Yes": "No");
    }
}