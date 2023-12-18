import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main d = new Main();
        d.process();
    }
    public void process() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        Data[] list = new Data[N];
        for (int i = 0; i < N; i++) {
            list[i] = new Data(scan.nextLong(), scan.nextLong(), scan.nextLong());
        }
        long answer = 0;
        Arrays.sort(list, new XDataComparator());
        answer = Math.max(answer, sub(N, M, list));
        Arrays.sort(list, new YDataComparator());
        answer = Math.max(answer, sub(N, M, list));
        Arrays.sort(list, new ZDataComparator());
        answer = Math.max(answer, sub(N, M, list));
        System.out.println(answer);
    }
    public long sub(int N, int M, Data[] list) {
        long answer = 0;
        long x_sum = 0;
        long y_sum = 0;
        long z_sum = 0;
        for (int i = 0; i < M; i++) {
            x_sum += list[i].x;
            y_sum += list[i].y;
            z_sum += list[i].z;
        }
        answer = Math.abs(x_sum) + Math.abs(y_sum) + Math.abs(z_sum);
        x_sum = 0;
        y_sum = 0;
        z_sum = 0;
        for (int i = N - M; i < N; i++) {
            x_sum += list[i].x;
            y_sum += list[i].y;
            z_sum += list[i].z;
        }
        return Math.max(answer,Math.abs(x_sum) + Math.abs(y_sum) + Math.abs(z_sum));
    }
    class Data {
        long x = 0;
        long y = 0;
        long z = 0;
        Data(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    class XDataComparator implements Comparator<Data> {
        @Override
        public int compare(Data o1, Data o2) {
            return Long.compare(o1.x, o2.x);
        }
    }
    class YDataComparator implements Comparator<Data> {
        @Override
        public int compare(Data o1, Data o2) {
            return Long.compare(o1.y, o2.y);
        }
    }
    class ZDataComparator implements Comparator<Data> {
        @Override
        public int compare(Data o1, Data o2) {
            return Long.compare(o1.z, o2.z);
        }
    }
}
