import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> abcdefList = new ArrayList<>();
        String read = br.readLine();
        while (!"".equals(read)) {
            abcdefList.add(read);
            read = br.readLine();
        }
        br = null;
        List<String> result = new ArrayList<>();
        for (String abcdefStr : abcdefList) {
            String[] abcdef = abcdefStr.split(" ");
            double a = Double.parseDouble(abcdef[0]);
            double b = Double.parseDouble(abcdef[1]);
            double c = Double.parseDouble(abcdef[2]);
            // x=(bf-ce)/(bd-ae)
            BigDecimal x = new BigDecimal((getDouble(abcdef[1]) * getDouble(abcdef[5])
                    - getDouble(abcdef[2]) * getDouble(abcdef[4]))
                    / (getDouble(abcdef[1]) * getDouble(abcdef[3])
                            - getDouble(abcdef[0]) * getDouble(abcdef[4]))).setScale(3,
                                    BigDecimal.ROUND_HALF_UP);
            double xD = Double.parseDouble(x.toString());
            // y=(c-ax)/b
            BigDecimal y = new BigDecimal(
                    (getDouble(abcdef[2]) - getDouble(abcdef[0]) * xD) / getDouble(abcdef[1]))
                            .setScale(3, BigDecimal.ROUND_HALF_UP);
            result.add(x + " " + y);
        }
        abcdefList = null;
        for (String resultOut : result) {
            System.out.println(resultOut);
        }
    }

    private static double getDouble(String d) {
        return Double.parseDouble(d);
    }
}