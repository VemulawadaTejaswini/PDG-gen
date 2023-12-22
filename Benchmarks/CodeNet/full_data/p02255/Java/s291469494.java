import java.util.Scanner;

/**
 * Sort
 */
public class Main {

    public int size;
    public int[] mx;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        this.size = sc.nextInt();
        this.mx = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.mx[i] = sc.nextInt();
        }
    }

    public void go() {
        for (int i = 1; i < this.size; i++) {
            this.print();
            int v = this.mx[i];
            int j = i - 1;
            while (j >= 0 && this.mx[j] > v) {
                this.mx[j + 1] = this.mx[j];
                j--;
            }
            this.mx[j + 1] = v;
        }
        this.print();
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.mx[i]);
            if (i == this.size - 1) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Main sort = new Main();
        sort.scan();
        sort.go();
    }
}
