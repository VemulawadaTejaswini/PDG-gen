
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author 97797
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new Main().run(args, System.in));
    }
    public String run(String[] args, InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        long N = Long.valueOf(reader.readLine());
        String[] val = reader.readLine().replaceAll("\\s+", " ").split(" ");
        List<Integer> list = Stream.of(val).map(Integer::parseInt).collect(Collectors.toList());

        int direct = 0;
        int pre = 0;
        int count = 0;
        for (Integer n : list) {
            if (pre == 0) {
                pre = n;
            } else {
                if (pre == n) {
                    // nop;
                } else {
                    if (direct == 0) {
                        if (n > pre) {
                            direct = 1;
                        } else {
                            direct = -1;
                        }
                    } else if (direct > 0) {
                        if (n > pre) {
                            //
                        } else {
                            count++;
                            direct = 0;                    
                        }
                    } else {//direct < 0
                        if (pre > n) {
                            //
                        } else {
                            count++;
                            direct = 0;                    
                        }
                    }
                    pre = n;
                }
            }
       }
        count++;
       return String.valueOf(count);
    }      
}
