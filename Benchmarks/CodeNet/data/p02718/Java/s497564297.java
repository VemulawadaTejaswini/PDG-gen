import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V;
        int temp;

        int[] a=new int[N];

        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int sum = 0;
        for (int value : a) {
            sum += value;
        }

        V = (sum / (4*M));
        temp = M;



        if (V > a[N-temp]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}