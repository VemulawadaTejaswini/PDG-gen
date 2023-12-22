import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        line = sc.nextLine();
        String[] l = line.split(" ");

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(l[i]);
        }

        for(int i = n - 1; 0 <= i; i--) {
          System.out.print(a[i]);
          if(i != 0) {
            System.out.print(" ");
          }
        }

        System.out.println();
    }
}