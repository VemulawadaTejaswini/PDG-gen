import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int checkNum;
        int blueBall;
        int redBall;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editedInputData = inputData.split(" ");
        checkNum = Integer.parseInt(editedInputData[0]);
        blueBall = Integer.parseInt(editedInputData[1]);
        redBall = Integer.parseInt(editedInputData[2]);

        int blueAndRed = blueBall + redBall;
        int countBall = checkNum % blueAndRed;
        int innerBlueAndRedBallSet = checkNum / blueAndRed;
        
        int totalBlueBall = innerBlueAndRedBallSet * blueBall;

        if (countBall <= blueBall) {
            totalBlueBall += countBall;
        } else {
            totalBlueBall += blueBall;
        }

        System.out.println(totalBlueBall);

    }
}