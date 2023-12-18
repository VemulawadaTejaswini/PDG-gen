import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();

        int A = parser.parseInt();
        int B = parser.parseInt();
        int C = parser.parseInt();
        int X = parser.parseInt();
        int Y = parser.parseInt();

        int minVal = Math.min(X, Y);
        System.out.println(minVal * Math.min(A + B, 2 * C) + (X - minVal) * Math.min(A, 2 * C) + (Y - minVal) * Math.min(B, 2 * C));
    }
}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws NoSuchElementException {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new NoSuchElementException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() throws NoSuchElementException {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Double parseDouble() throws NoSuchElementException {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    String parseString() {
        fill();
        String string = inputs.pollFirst();
        if(string == null){
            throw new NoSuchElementException();
        }
        return string;
    }

}
