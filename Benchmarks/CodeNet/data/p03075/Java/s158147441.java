import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prm = sc.nextLine();
        String[] numberArray = prm.split(" ");
        int distance = Integer.parseInt(numberArray[5]);
        int firstAntenna = Integer.parseInt(numberArray[0]);
        int lastAntenna = Integer.parseInt(numberArray[4]);
        
        if (lastAntenna - firstAntenna > distance) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }   
    }
}