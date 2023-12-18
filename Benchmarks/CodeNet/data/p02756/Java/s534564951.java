import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputStringData = new StringBuilder(scanner.nextLine());
        String inputRepeatData = scanner.nextLine();
        int repeatNumber = Integer.parseInt(inputRepeatData);
        String inputOperationRowBeforeEdit;
        for (int index1 = 0; index1 < repeatNumber; index1++) {
            inputOperationRowBeforeEdit = scanner.nextLine();
            String[] inputOperationRow = inputOperationRowBeforeEdit.split(" ");
            int operation1 = Integer.parseInt(inputOperationRow[0]);
            if (operation1 == 1) {
                inputStringData.reverse();
            } else if (operation1 == 2) {
                int operation2 = Integer.parseInt(inputOperationRow[1]);
                if (operation2 == 1) {
                    inputStringData.reverse();
                    inputStringData.append(inputOperationRow[2]);
                    inputStringData.reverse();
                } else if (operation2 == 2) {
                    inputStringData.append(inputOperationRow[2]);
                }
            }
            inputOperationRow = null;
        }
        scanner.close();

        // 結果の出力
        System.out.println(inputStringData.toString());

    }

}