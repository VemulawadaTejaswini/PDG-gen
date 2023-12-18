import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> weaters = new ArrayList<>(Arrays.asList("Sunny", "Cloudy", "Rainy"));
        int index = weaters.indexOf(sc.next());
        if (index == 2) {
            System.out.println(weaters.get(0));
        } else {
            System.out.println(weaters.get(index + 1));
        }
    }
}