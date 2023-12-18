import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> blista = new ArrayList<>(n);
        List<String> lista = new ArrayList<>(n);
        List<String> blist = new ArrayList<>(n);
        int bsizea = 0;
        int sizea = 0;
        int bsize = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            for (int idx = s.indexOf("AB"); idx > -1; idx = s.indexOf("AB", idx + 2)) {
                count++;
            }
            if (s.startsWith("B") && s.endsWith("A")) {
                bsizea++;
            } else if (s.endsWith("A")) {
                sizea++;
            } else if (s.startsWith("B")) {
                bsize++;
            }
        }
        System.out.println(count + Integer.min(sizea, bsize)
                + ((sizea == bsize) ? Integer.max(bsizea - 1, 0) : bsizea));
    }
}
