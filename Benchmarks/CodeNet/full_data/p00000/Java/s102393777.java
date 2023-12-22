class Main {
    public static void main(String[] a) {
        int i, j, result;

        for (i = 1; i < 10; ++i) {
            for (j = 1; j < 10; ++j) {
                result = i * j;
                System.out.printf("%dx%d=%d\n", i,j,result);
            }
        }
    }
}