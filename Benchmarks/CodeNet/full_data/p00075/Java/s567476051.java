import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(scn.useDelimiter("[\\s,]+"); scn.hasNextInt();) {
            int num = scn.nextInt();
            double weight = scn.nextDouble(), height = scn.nextDouble();
            if(weight / Math.pow(height, 2) >= 25) {
                System.out.println(num);
            }
        }
    }
}