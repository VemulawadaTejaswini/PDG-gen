import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int testCaseNum;
        int correctTestCaseNum;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editInputData = inputData.split(" ");

        testCaseNum = Integer.parseInt(editInputData[0]);
        correctTestCaseNum = Integer.parseInt(editInputData[1]);

        if (testCaseNum == correctTestCaseNum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}