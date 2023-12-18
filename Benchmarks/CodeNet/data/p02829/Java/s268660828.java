import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            set.remove(Integer.parseInt(br.readLine()));
        }
        System.out.println(set.iterator().next());
    }
}