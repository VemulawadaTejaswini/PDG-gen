import java.util.Scanner;
import java.util.Vector;

public class Main {
    private int cnt = 0;
    private Vector<Integer> G;
    private int[] a;

    public Main() {
        G = new Vector<Integer>();
    }

    private void shellSort(int n) {
        for (int i = 1; ;){
            if (i > n) break;
            G.add(i) ;
            i = i * 3 + 1;
        }
        int m = G.size();
        for (int i=m-1; i>=0; i--) insertionSort(n, (int)G.elementAt(i));
    }
    private void insertionSort(int n, int g) {
        for (int i=g; i<n; i++){
            int v = a[i];
            int j = i-g;
            while (j >=0 && a[j] > v){
                a[j+g] = a[j];
                j -= g;
                cnt++;
            }
            a[j+g] = v;
        }
    }
    private void output(int n){
        System.out.println(G.size());
        for (int i=G.size()-1; i>=0; i--){
            System.out.print((int)G.elementAt(i));
            char c;
            System.out.printf("%s", c=(i == 0)?'\n':' ');
        }
        System.out.println(cnt);
        for (int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Main shellSort = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        shellSort.a = new int[n];
        for (int i=0; i<n; i++){
            shellSort.a[i] = scanner.nextInt();
        }
        shellSort.shellSort(n);
        shellSort.output(n);
    }
}

