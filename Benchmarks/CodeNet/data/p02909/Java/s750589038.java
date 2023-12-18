import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String h = scan.nextLine();
                String weather = "Sunny";

                if("Sunny".equals(h)){
                  weather = "Cloudy";
                } else if ("Cloudy".equals(h)){
                  weather = "Rainy";
                }
                System.out.println(weather);
    }
}
