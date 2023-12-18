import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (4*a*b > Math.pow((c-b-a),2)){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}