import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String inData;
            while ((inData = scan.nextLine()) != null) {
                String[] inDataList = inData.split(" ");
                int sum = Integer.parseInt(inDataList[0]) + Integer.parseInt(inDataList[1]);
                System.out.println(String.valueOf(sum).length());
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}