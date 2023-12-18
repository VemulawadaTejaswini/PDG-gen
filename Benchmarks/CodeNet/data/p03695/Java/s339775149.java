import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author 97797
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println(new Main().run(args, System.in));
    }
    public String run(String[] args, InputStream in) {
        String result = null;
        try {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            int N = Integer.parseInt(reader.readLine());
            
            List<Integer> list = reader.lines()
                    .flatMap(s -> Stream.of(
                            s.replaceAll("\\s+", " ").split(" ")))
                    .limit(N).map(Integer::parseInt)
                    .map(n -> n / 400)
                    .sorted()
                    .collect(Collectors.toList());
            long c1 = list.stream()
                    .filter(n -> n <8)
                    .distinct().count();
            long c2 = list.stream()
                    .filter(n -> n >= 8)
                    .count();
            long min = (c1 == 0) ? 1 : c1;
//            long max = (c1 + c2) > 8 ? 8 : (c1 + c2);
            long max = (c1 + c2);
            result = String.valueOf(min) +" "+ String.valueOf(max);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
