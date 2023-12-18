import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();

        int[] h = new int[n];
        for(int i=0; i<n; i++) {
            h[i] = sc.nextInt();
        }

        double[] tmp = new double[n];
        for(int i=0; i<n; i++) {
            tmp[i] = Math.abs(a-(t-h[i]*0.006));
        }

        double output = tmp[0];
        int place = 0;
        for(int i=0; i<tmp.length; i++) {
            if(output > tmp[i]) {
                output = tmp[i];
                place = i;
            }
        }

        System.out.println(place+1);
        sc.close();
    }
}
