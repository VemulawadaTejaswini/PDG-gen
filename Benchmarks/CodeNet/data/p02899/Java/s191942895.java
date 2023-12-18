import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ABC142CStudent[] a = new ABC142CStudent[n];
        for(int i=0; i<n; i++) {
            ABC142CStudent s = new ABC142CStudent();
            s.id = i+1;
            s.xth = in.nextInt();
            a[i] = s;
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++) {
            System.out.print(a[i].id);
            if(i==n-1) {
                System.out.println();
            }
            else {
                System.out.print(' ');
            }
        }
    }
}
class ABC142CStudent implements Comparable<ABC142CStudent> {
    int id;
    int xth;

    @Override
    public int compareTo(ABC142CStudent o) {
        return this.xth - o.xth;
    }
}
