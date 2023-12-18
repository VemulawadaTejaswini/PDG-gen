import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            char[] data = s.toCharArray();
            Arrays.sort(data);
            list.add(data);
        }
        char[] prev = list.get(0);
        for (int i = 1; i < N; i++) {
            char[] data = list.get(i);
            List<Character> cl = new ArrayList<>();
            for(int j = 0; j < prev.length; j++) {
                for(int k = 0; k < data.length; k++) {
                    if (prev[j] < data[k]) {
                        break;
                    }
                    if (prev[j] == data[k]) {
                        cl.add(prev[j]);
                        break;
                    }
                    if (data[k] < prev[j]) {
                        continue;
                    }
                }
            }
            prev = new char[cl.size()];
            for(int j = 0; j < cl.size(); j++) {
                prev[j] = cl.get(j);
            }
        }
        System.out.println(prev);
    }
}
