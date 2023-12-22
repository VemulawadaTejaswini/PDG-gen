class Main {
    public static void main (String[] args) {
        int[] top = {args[0], 0, 0};

        for (int i = 1; i < 10; i++) {
            if (args[i] > top[0]) {
                top[2] = top[1];
                top[1] = top[0];
                top[0] = args[i];
            } else if (args[i] > top[1]) {
                top[2] = top[1];
                top[1] = args[i];
            } else if (args[i] > top[2]) {
                top[2] = args[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(top[i]);
        }
    }
}