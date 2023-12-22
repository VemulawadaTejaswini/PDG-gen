import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int N = Integer.parseInt(line);
        String[] lines = bufferedReader.readLine().split(" ");
        List<String> Astr = Arrays.asList(lines);
        List<BigInteger> A = Astr.stream().map(BigInteger::new).collect(Collectors.toList());
        BigInteger res = new BigInteger("1");
        for (BigInteger a : A)
            res = res.multiply(a);
        BigInteger lim = new BigInteger("1000000000000000000");
        System.out.println(res.compareTo(lim) > 0 ? "-1" : res.toString());
    }
}
