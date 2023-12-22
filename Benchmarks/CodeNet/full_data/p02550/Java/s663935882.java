import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
         new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        long n = Long.parseLong(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        HashSet<Integer> alreadyIn = new HashSet<Integer>();
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        ArrayList<Integer> cycle = new ArrayList<Integer>();
        int cycleStart =  x;
        while (!alreadyIn.contains(cycleStart)) {
            alreadyIn.add( cycleStart);
            sequence.add(cycleStart);
            cycleStart = (int) (((long) cycleStart * cycleStart) % m);
        }

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int index = sequence.size() - 1;
        while (sequence.get(index) != cycleStart) {
            stack.addFirst(sequence.get(index));
            index--;
        }
        stack.addFirst(sequence.get(index));

        for (int i : stack) cycle.add(i);

        index = 0;
        long sum = 0;
        while (sequence.get(index) != cycleStart && n > 0) {
            sum += sequence.get(index);
            n--;
            index++;
        }

        if (n == 0) {
            out.println(sum);
            return;
        } else {
            long cycleSum = 0;
            for (int i : cycle) cycleSum += i;
            sum += cycleSum * (n / cycle.size());
            for (int i = 0; i < n % cycle.size(); i++) sum += cycle.get(i);

            out.println(sum);
        }

        out.close();
    }
}