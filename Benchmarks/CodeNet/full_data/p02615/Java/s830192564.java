import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        int buf;
        int num;
        while ((buf = System.in.read()) != '\n') {
            builder.appendCodePoint(buf);
        }

        num = Integer.parseInt(builder.toString());
        ArrayList<Integer> list = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            builder.setLength(0);
            while ((buf = System.in.read()) != ' ' && buf != '\n') {
                builder.appendCodePoint(buf);
            }

            list.add(Integer.valueOf(builder.toString()));
        }

        list.sort(Comparator.reverseOrder());
        int sum = list.get(0);
        int j = 1;
        boolean even = false;
        for (int i = 1; i < num - 1; i++) {
            sum += list.get(j);
            if (even) {
                j++;
            }
            even = !even;
        }

        System.out.print(sum);
    }
}
