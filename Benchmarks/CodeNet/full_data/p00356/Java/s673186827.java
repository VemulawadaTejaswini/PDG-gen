import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int result = x + y + 2;
        double equation;

        for(double i = 0.0; i <= x; i++) {
            equation = i * y / x;
            if(equation == Math.floor(equation)) result--;
        }
        System.out.println(result);
    }
}