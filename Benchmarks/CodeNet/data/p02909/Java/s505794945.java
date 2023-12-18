import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String todayWeather = sc.next();
        if(todayWeather.equals("Sunny")){
            System.out.println("Cloudy");
        }else if(todayWeather.equals("Cloudy")){
            System.out.println("Rainy");
        } else{
            System.out.println("Sunny");
        }
    }
}