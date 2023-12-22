import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        int i = 1;
        List<List<Integer>> datasets = readInput();
        for (List<Integer> data: datasets) {
            if (data.get(0) != 0) {
                System.out.printf("Case %d: %d\n", i++, data.get(0));
            }
        }
    }

    public static List<Integer> readData(String line) {
        
        List<Integer> data = new ArrayList<Integer>();

        Scanner sc = new Scanner(line);
        while (sc.hasNextInt()) {
            data.add(sc.nextInt());
        }
        return data;
    }

    public static List<List<Integer>> readInput() {

        List<List<Integer>> datasets = new ArrayList<List<Integer>>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.lines().forEach(e -> datasets.add(readData(e)));
        return datasets;
    }
}