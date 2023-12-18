import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        double hen = recursive(l);

        System.out.println(hen * hen * hen);
    }

    static double recursive(double l) {
        double hen = l / 3;
        if (hen + hen + hen == l) {
            return hen;
        }
        double diff = l - (hen + hen + hen);
        if(diff < 0.0000001){
            return hen;
        }
        double hen2 = recursive(diff);
        return hen + hen2;
    }
}