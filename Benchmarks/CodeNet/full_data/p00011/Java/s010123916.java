import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputReader);

        final int column = Integer.parseInt(reader.readLine());
        NumberList list = new NumberList(column);

        final int row = Integer.parseInt(reader.readLine());
        for (int i = 0; i < row; i++) {
            final String line = reader.readLine();
            final StringTokenizer tokenizer = new StringTokenizer(line, ",");

            final int a = Integer.parseInt(tokenizer.nextToken());
            final int b = Integer.parseInt(tokenizer.nextToken());

            list.swap(a - 1, b - 1);
        }

        StringBuilder builder = new StringBuilder();
        List<Integer> resultList = list.getList();
        for (int value : resultList) {
            builder.append(String.format("%d\n", value));
        }
        System.out.print(builder);
    }

}

class NumberList {

    private List<Integer> list;

    public NumberList(int size) {
        list = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
    }

    public void swap(int index1, int index2) {
        int tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }

    public List<Integer> getList() {
        return list;
    }

}