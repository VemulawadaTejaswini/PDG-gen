import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Parser parser = new Parser();

    public static void main(String[] args) {
        long N = parser.parseLong();

        long ans = (N - 1) * N / 2;
        System.out.println(ans);
    }
}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new NoSuchElementException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Long parseLong() {
        fill();
        if(!inputs.isEmpty()) {
            return Long.parseLong(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Double parseDouble() {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    String parseString() {
        fill();
        return inputs.removeFirst();
    }

}