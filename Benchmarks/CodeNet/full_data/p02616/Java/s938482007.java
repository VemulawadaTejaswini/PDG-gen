import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        int buf;

        while ((buf = System.in.read()) != ' ');
        while ((buf = System.in.read()) != '\n') {
            builder.appendCodePoint(buf);
        }
        int num = Integer.parseInt(builder.toString());
        ArrayList<Integer> list = new ArrayList<>();
        do {
            builder.setLength(0);
            while ((buf = System.in.read()) != ' ' && buf != '\n') {
                builder.appendCodePoint(buf);
            }

            list.add(Integer.valueOf(builder.toString()));

        } while (buf != '\n');

        BigInteger max = max(new ArrayList<>(), list, num);
        int result = max.remainder(BigInteger.valueOf(1000000007)).intValue();
        if (result < 0) result = 1000000007 + result;
        System.out.print(result);
    }

    private static BigInteger max(ArrayList<Integer> la, ArrayList<Integer> lb, int num) {
        if (num == 1) {
            return lb.stream().map(b -> {
                BigInteger result = BigInteger.valueOf(b);
                for (int a : la) {
                    result = result.multiply(BigInteger.valueOf(a));
                }
                return result;
            })
            .max(Comparator.naturalOrder()).get();
        }

        return lb.stream().map(b -> {
            ArrayList<Integer> lista = new ArrayList<>(la);
            lista.add(b);
            ArrayList<Integer> listb = new ArrayList<>(lb);
            listb.remove(b);
            return max(lista, listb, num - 1);
        }).max(Comparator.naturalOrder()).get();
    }
}
