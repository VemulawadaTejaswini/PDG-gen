import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long Q = sc.nextLong();

        long[] list = new long[N];
        for (int i=0; i < N ; i++) {
        	list[i] = K - Q ;
        }

        for (int i = 0; i < Q ; i ++) {
        	list[sc.nextInt()-1] += 1;
        }
        sc.close();
        for (int i=0; i < N ; i++) {
        	if (list[i] > 0) {
        		System.out.println("Yes");
        	}
        	else {
        		System.out.println("No");
        	}
        }
    }
}