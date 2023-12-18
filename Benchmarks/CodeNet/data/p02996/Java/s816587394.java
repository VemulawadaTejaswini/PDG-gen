import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        // 入力が取得できる
        int N = scanner.nextInt();

        List<Work> l = new ArrayList<Work>();

        for (int i=1; i <= N; i++) {

            int w = scanner.nextInt();
            int e = scanner.nextInt();

            Work work = new Work(w, e);
            l.add(work);
        }

        l.sort(new Comparator<Work>() {
            @Override
            public int compare(Work o1, Work o2) {
                return o1.endtime - o2.endtime;
            }
        });

        int ws =0;

        for (Work work : l) {

            ws = ws + work.work;

            if (ws > work.endtime) {
                System.out.print("No");
                System.exit(0);
            }
        }

        System.out.print("Yes");
        scanner.close();
    }

    static class Work {

       public int work;
       public int endtime;

       public Work(int work, int endtime) {
           this.work = work;
           this.endtime = endtime;
       }

    }
}