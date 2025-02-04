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
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum += list.get(i/2);
        }
        System.out.print(sum);
    }
}
