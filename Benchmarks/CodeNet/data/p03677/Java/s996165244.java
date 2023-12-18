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
        int M = parser.parseInt();

        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = parser.parseInt();
        }

        long[] costs = new long[M + 1];
        long[] cnts = new long[M + 1];
        long costSum = 0;

        for(int i = 1; i < N; i++){
            if(a[i - 1] < a[i]){
                long v = a[i] - a[i - 1];
                costs[a[i]] += v;
                cnts[a[i - 1]] -= 1;
                cnts[a[i]] += 1;
                costSum += v;
            }else if(a[i - 1] > a[i]){
                long v = (M - a[i - 1]) + a[i];
                costs[a[i]] += v;
                cnts[a[i]] += 1;
                costSum += v;
            }
        }

        long answer = costSum;

        long cntSum = 0;
        long cntAcc = 0;
        long currCostSum = 0;

        for(int i = M; i >= 1; i--){
            cntSum += cnts[i];
            cntAcc += cntSum;
            currCostSum += costs[i];
            long v = costSum + cntAcc - currCostSum;

            answer = Math.min(answer, v);
        }

        System.out.print(answer);
    }
}
