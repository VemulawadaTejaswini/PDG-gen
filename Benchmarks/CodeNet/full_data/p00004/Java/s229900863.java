import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            if(s.length()==0) return;
            List<Integer> value = Stream.of(s.split(" ")).map(val->Integer.valueOf(val)).collect(Collectors.toList());
            int a = value.get(0);
            int b = value.get(1);
            int c = value.get(2);
            int d = value.get(3);
            int e = value.get(4);
            int f = value.get(5);

            double x = (b*d-a*e) == 0 ? 0 : (b*f-c*e)*1000/(b*d-a*e);
            double y = (a*e-b*d) == 0 ? 0 : (a*f-c*d)*1000/(a*e-b*d);
            System.out.printf("%.3f %.3f", Math.round(x)/1000, Math.round(y)/1000);
            System.out.println();
        }
    }
}