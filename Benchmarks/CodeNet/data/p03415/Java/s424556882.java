import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    int limit = 10000;
    int N, M;
    boolean judge[][] = new boolean[limit][limit];
    boolean visited[] = new boolean[limit];
    int d[][] = new int[limit][limit];
    int length[] = new int[N];
    boolean ans=true;
    public static void main(String[] args) {
        new Main().solve();
    }
    void solve() {
        Scanner sc = new Scanner(System.in);
        String c[]=new String[3];
        c[0]=sc.next();
        c[1]=sc.next();
        c[2]=sc.next();
        for(int i=0;i<3;i++){
            System.out.println(c[i].charAt(i));
        }
    }

}