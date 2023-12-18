import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        String[] reading = null;
        try {
        reading = reader.readLine().split(" ");

        set.add(reading[0]);
        set.add(reading[1]);
        set.add(reading[2]);

        if (set.size() > 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
