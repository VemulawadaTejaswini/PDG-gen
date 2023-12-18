

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 28-03-2017.
 */
class Main{
    static void solve(Long[] numbers, int a, int b) {
        Arrays.sort(numbers, Collections.reverseOrder());
        HashMap<Long, Integer> freqMap = new HashMap<>();
        Arrays.stream(numbers).forEach(num -> freqMap.put(num, freqMap.getOrDefault(num, 0) + 1));

        Map<Long, Integer> candidateMap = new HashMap<>();
        for (int i = 0; i < a; i++) {
            candidateMap.put(numbers[i], candidateMap.getOrDefault(numbers[i], 0) + 1);
        }

        long ways = 1L;
        for (Map.Entry<Long, Integer> entry : candidateMap.entrySet()) {
            ways *= freqMap.get(entry.getKey()) / entry.getValue();
        }

        double mean = 0.0d;
        for (int i = 0; i < a; i++) {
            mean += numbers[i];
        }
        mean /= a;

        System.out.printf("%.06f\n", mean);
        System.out.println(ways);
    }

    static Integer[] readIntArray(BufferedReader br) throws IOException {
        String s = br.readLine();
        String[] tokens = s.trim().split(" +");
        Integer[] array = new Integer[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            array[i] = Integer.valueOf(tokens[i]);
        }
        return array;
    }

    static Long[] readLongArray(BufferedReader br) throws IOException {
        String s = br.readLine();
        String[] tokens = s.trim().split(" +");
        Long[] array = new Long[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            array[i] = Long.valueOf(tokens[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer[] nab = readIntArray(br);
            Long[] array = readLongArray(br);
            solve(array, nab[1], nab[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
