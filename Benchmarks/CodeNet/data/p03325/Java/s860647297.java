import java.util.Scanner;

class Main {
    public static boolean allOdd(int a[]) {
        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int N;
        int a[];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        N = sc.nextInt();
        a = new int[N];

        for(int i=0;i<N;i++) {
            a[i] = sc.nextInt();
        }

        while(!allOdd(a)) {
            int evenMax = -1;
            for(int i=0;i<N;i++) {
                if (a[i] % 2 == 0) {
                    if (evenMax == -1) {
                        evenMax = i;
                    } else if (a[i] > a[evenMax]) {
                        evenMax = i;
                    }
                }
            }
            for(int i=0;i<N;i++) {
                if (i == evenMax) {
                    a[i] /= 2;
                } else {
                    a[i] *= 3;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
