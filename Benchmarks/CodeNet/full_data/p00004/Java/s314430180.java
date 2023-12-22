import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine() ){
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            float d = scanner.nextFloat();
            float e = scanner.nextFloat();
            float f = scanner.nextFloat();

            float x = ((c*e)-(f*b)) / ((a*e)-(d*b));
            float y = (c-(x*a))/b;

            if (x == -0){x = 0;}
            if (y == -0){y = 0;}

            System.out.printf("%.3f %.3f\n",x,y);
        }
    }
}
