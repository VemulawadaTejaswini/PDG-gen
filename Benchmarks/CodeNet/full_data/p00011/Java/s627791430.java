import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int n = sc.nextInt();
        int save, x, y;
        int[] ans =  new int[row+1];
        for(int i=1; i<=row; i++) {
            ans[i] = i;
        }
        for(int i=0; i<n; i++) {
            String line = sc.next();
            String[] a = line.split(",");
            x = Integer.parseInt(a[0]);
            y = Integer.parseInt(a[1]);
            save = ans[x];
            ans[x] = ans[y];
            ans[y] = save;

        }
        for(int i=1; i<=row; i++) {
            System.out.println(ans[i]);
        }
    }
}

