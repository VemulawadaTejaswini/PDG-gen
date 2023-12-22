import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        List<Log> logs = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Log l = new Log();
            l.iniLen = in.nextInt();
            l.len = l.iniLen / l.nDiv;
            logs.add(l);
        }

        Collections.sort(logs);

        for (int i = 0; i < k; i++) {
            Log mx = logs.remove(n - 1);
            mx.nDiv++;
            mx.len = mx.iniLen / mx.nDiv;
            int index = Collections.binarySearch(logs, mx);
            if (index < 0) {
                index = - index - 1;
            }
            logs.add(index, mx);
        }

        System.out.println((int)Math.ceil(logs.get(n - 1).len));
    }
}

class Log implements Comparable<Log> {
    double iniLen = -1;
    int nDiv = 1;
    double len = -1;

    @Override
    public int compareTo(Log o) {
        return len > o.len ? 1 : -1;
    }
}