import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String rtnXml = "1 2¥n3";
//        InputStream bais = new ByteArrayInputStream(rtnXml.getBytes(StandardCharsets.UTF_8));
//        Scanner sc = new Scanner(bais);
        Scanner sc = new Scanner(System.in);
        // N, K
        String nk = sc.nextLine();
        Integer n = Integer.valueOf(nk.substring(0, 1));
        // Integer k = Integer.valueOf(nk.substring(2, 3));
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            counts.put(i + 1, 0);
        }
        while (sc.hasNextLine()) {
            // Integer d = Integer.valueOf(sc.nextLine());
            String has = sc.nextLine();
            for (int i = 0; i < has.length(); i++) {
                String key = has.substring(i, i + 1);
                if (!has.substring(i, i + 1).equals(" ")) {
                    counts.put(Integer.valueOf(key), counts.get(Integer.valueOf(key)) + 1);
                }
            }
        }
        System.out.println((int) counts.entrySet().stream().filter(it -> it.getValue() == 0).count());
    }
}
