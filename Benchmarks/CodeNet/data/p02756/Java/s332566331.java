import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputStringData = scanner.nextLine();
        String inputRepeatData = scanner.nextLine();
        int repeatNumber = Integer.parseInt(inputRepeatData);
        String[][] inputOperationRow = new String[repeatNumber][3];
        for (int index = 0; index < repeatNumber; index++) {
            String inputOperationRowBeforeEdit = scanner.nextLine();
            inputOperationRow[index] = inputOperationRowBeforeEdit.split(" ");
        }
        scanner.close();

        // 文字列の加工
        for (String[] editData : inputOperationRow) {
            int operation1 = Integer.parseInt(editData[0]);
            switch (operation1) {
                case 1:
                    char[] inputCharArray = inputStringData.toCharArray();
                    inputStringData = null;
                    char[] reverseCharArray = new char[inputCharArray.length];
                    int reverseIndex = 0;
                    for (int index = inputCharArray.length - 1; index >= 0; index--) {
                        reverseCharArray[reverseIndex] = inputCharArray[index];
                        reverseIndex++;
                    }
                    for (int index = 0; index < reverseCharArray.length; index++) {
                        inputCharArray[index] = reverseCharArray[index];
                    }
                    inputStringData = new String(inputCharArray);
                    inputCharArray = null;
                    reverseCharArray = null;
                    break;
                case 2:
                    int operation2 = Integer.parseInt(editData[1]);
                    switch (operation2) {
                        case 1:
                            inputStringData = editData[2] + inputStringData;
                            break;
                        case 2:
                            inputStringData = inputStringData + editData[2];
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            editData = null;
            System.gc();
        }

        // 結果の出力
        System.out.println(inputStringData);

    }

}