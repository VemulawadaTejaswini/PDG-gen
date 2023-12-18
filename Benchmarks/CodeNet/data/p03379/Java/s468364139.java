public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[]xCopy = new int[N];
        for (int i = 0; i < N; i++ ) {
            int n = sc.nextInt();
            X[i] = n;
            xCopy[i] = n;
        }

        Arrays.sort(xCopy);

        int median1 = xCopy[N/2 - 1];
        int median2 = xCopy[N/2];

        for (int i = 0; i < N; i++) {
            if (X[i] <= median1) {
                System.out.println(median2);
            } else {
                System.out.println(median1);
            }
        }
    }

}