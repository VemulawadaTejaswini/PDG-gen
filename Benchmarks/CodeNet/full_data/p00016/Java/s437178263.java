import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double step = 0;
        double deg = 0;
        
        
        while (true) {
            String input = scanner.nextLine();
            String[] str = new String[2];
            str = input.split(",");
            
            if (str[0].equals("0") && str[1].equals("0")) {
                break;
            }
            step = Double.valueOf(str[0]);

            x += step * Math.sin(Math.toRadians(deg));
            y += step * Math.cos(Math.toRadians(deg));
            
            deg += Double.valueOf(str[1]);

        }
        System.out.println((int)x);
        System.out.println((int)y);
   }
        
}