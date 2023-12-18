import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String todayWeather = scanner.next();
        System.out.println(todayWeather.equals("Sunny") ? "Cloudy" : todayWeather.equals("Cloudy") ? "Rainy" : "Sunny");
    }
}
