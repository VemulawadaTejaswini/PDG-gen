import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int low = 1;
        int high = n;
        int steps = 0;
        while(steps<m) {
            System.out.println(low++ + " " + (high--));
            steps++;
        }
    }
}