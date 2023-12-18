import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int array[][] = new int [m][2];

        for (int j = 0; j < m; j++) {
            array[j][0] = sc.nextInt();
            array[j][1] = sc.nextInt();
        }

        Data[] d = new Data[m];
        for (int i = 0; i < m; i++) {
            d[i] = new Data(array[i][0], array[i][1]);
        }

        Arrays.sort(d);

        int num = 10;
        int num2 = 10;

        for (int j = 0; j < m; j++) {
            if (array[j][0] == 1 && array[j][1] == 0) {
                System.out.println("-1");
                return;
            }

            if (array[j][0] == num && !(array[j][1] == num2)){
                System.out.println("-1");
                return;
            }

            num = array[j][0];
            num2 = array[j][1];
        }

        StringBuilder ans = new StringBuilder();

        for (int j = 0; j < n; j++) {
            ans.append("0");
        }


        for (int j = 0; j < m; j++) {
            ans.replace(array[j][0] - 1, array[j][0], Integer.toString(array[j][1]));
        }

        System.out.println(ans);

    }

    public static class Data implements Comparable<Data> {
        int a, b;
        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(Data other) {
            if (this.a == other.a) {
                return this.b - other.b;
            } else {
                return this.a - other.a;
            }
        }
    }
}