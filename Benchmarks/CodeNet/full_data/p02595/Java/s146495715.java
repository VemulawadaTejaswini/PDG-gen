public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double D = scan.nextDouble();

        int overCount = 0;

        for (int i = N; i > 0; i--) {
            double X = scan.nextDouble();
            double Y = scan.nextDouble();
            double dis = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
            if (dis <= D) {
                overCount++;
            }
        }
        System.out.println(overCount);
    }