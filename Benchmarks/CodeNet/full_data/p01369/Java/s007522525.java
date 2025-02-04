import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    
    static final String rightkeys = "yuiophjklnm";
    static int cnt = 0;
    static List<String> hands = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine().trim()) != null && !"#".equals(line)) {
            output(line);
            clear();
        }
    }

    public static void output(String line) {
        IntStream.range(0, line.length()).mapToObj(i->line.substring(i,i+1)).forEach(key -> {
            if(rightkeys.indexOf(key) != -1) {
                hands.add("r");
            } else {
                hands.add("l");
            };
        });
        IntStream.range(0, hands.size()).filter(i->0<i).forEach(i -> {
            if(!hands.get(i-1).equals(hands.get(i))) cnt++;
        });
        System.out.println(cnt);
    }

    public static void clear() {
        hands.clear();
        cnt = 0;
    }
}
