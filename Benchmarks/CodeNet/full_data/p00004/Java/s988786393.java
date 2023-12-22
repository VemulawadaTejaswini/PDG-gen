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
        while(!"".equals(read)) {
            abcdefList.add(read);
            read = br.readLine();
        }
        List<String> result = new ArrayList<>();
        for (String abcdefStr : abcdefList) {
            String[] abcdef = abcdefStr.split(" ");
            double a = Double.parseDouble(abcdef[0]);
            double b = Double.parseDouble(abcdef[1]);
            double c = Double.parseDouble(abcdef[2]);
            double d = Double.parseDouble(abcdef[3]);
            double e = Double.parseDouble(abcdef[4]);
            double f = Double.parseDouble(abcdef[5]);
            // x=(bf-ce)/(bd-ae)
            BigDecimal x = new BigDecimal((b * f - c * e) / (b * d - a * e)).setScale(3,
                    BigDecimal.ROUND_HALF_UP);
            double xD = Double.parseDouble(x.toString());
            // y=(c-ax)/b
            BigDecimal y = new BigDecimal((c - a * xD) / b).setScale(3, BigDecimal.ROUND_HALF_UP);
            result.add(x + " " + y);
        }
        for(String resultOut : result) {
            System.out.println(resultOut);
        }
    }

}