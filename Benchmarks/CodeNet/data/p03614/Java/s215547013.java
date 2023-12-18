import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new IOException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
        return inputs.pollFirst();
    }

}

public class Main {


    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();

        int N = parser.parseInt();

        int[] p = new int[N];
        for(int i = 0; i < N; i++){
            p[i] = parser.parseInt() - 1;
        }

        int ans = 0;
        int idx = 0;
        while(idx < N){
            if(p[idx] == idx){
                ans += 1;
                idx += 2;
                continue;
            }
            idx += 1;
        }

        System.out.print(ans);
    }
}
