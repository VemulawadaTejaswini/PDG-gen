import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int crackerN = scanner.nextInt();
        int peopleM = scanner.nextInt();
        int exceed = crackerN%peopleM;
        System.out.println(crackerN+","+peopleM+","+exceed);
    }
}
