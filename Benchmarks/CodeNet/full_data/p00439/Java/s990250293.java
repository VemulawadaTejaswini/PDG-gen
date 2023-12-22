import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = -9;
        int range = -9;
        String line;
        List<Integer> inputs = new ArrayList<>();
        while ((line = br.readLine().trim()) != null && !line.isEmpty() && !"0 0".equals(line)) {
            if(cnt < 0) {
                List<Integer> list = Arrays.stream(line.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
                cnt = list.get(0);
                range = list.get(1);
            } else {
                inputs.add(Integer.valueOf(line));
                if(--cnt==0) {
                    output(inputs, range);
                    inputs.clear();
                    cnt = -9;
                }
            }
        }
    }

    public static void output(List<Integer> list, int range) {
        int max = IntStream.range(0,range).map(j->list.get(j)).sum();
        int sum = max;
        for(int i=range; i<list.size(); i++) {
            sum = max - list.get(i-range) + list.get(i);
            if(max<sum) max=sum;
        }
        System.out.println(max);
    }
}