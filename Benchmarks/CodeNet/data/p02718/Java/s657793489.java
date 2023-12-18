import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), a[] = new int[n], sum = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        sum /= (4 * m);
        for (int i = 0; i < n; i++) {
            if (a[i] >= sum)
                cnt++;
        }
        if (cnt >= m)
            System.out.println("Yes");
        else {
            System.out.println("No");
        }
    }

}
