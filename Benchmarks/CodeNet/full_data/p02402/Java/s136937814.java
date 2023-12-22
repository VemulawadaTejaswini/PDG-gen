import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        IntSummaryStatistics iss;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine(); //1行目は捨てる
            iss = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .summaryStatistics();
        }

        System.out.printf("%d %d %d%n", iss.getMin(), iss.getMax(), iss.getSum());
    }
}

