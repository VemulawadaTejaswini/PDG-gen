import java.util.Scanner;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] datum;
        int distance, angular = 0;
        double x = 0, y= 0;
        double rad = 0.0;
        
        while(sc.hasNextLine()){
            input = sc.nextLine();
            datum = input.split(",");
            
            if(Integer.parseInt(datum[0]) == 0 && Integer.parseInt(datum[1]) == 0){
                System.out.println((int)x);
                System.out.println((int)y);
                return;
            }
            
            distance = Integer.parseInt(datum[0]);

            rad += Math.PI * angular / 180;
            x += distance * Math.sin(rad);
            y += distance * Math.cos(rad);
            
            angular = Integer.parseInt(datum[1]);
        }
    }
}

