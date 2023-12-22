import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ary = new int[n];
        
        for (int i = 0; i < n; i++)
            ary[i] = sc.nextInt();
        
        int j = n - 1;
        System.out.print(ary[j]);
        while (--j >= 0) {
            System.out.print(' ');
            System.out.print(ary[j]);
        }
        System.out.println();
    }
}

