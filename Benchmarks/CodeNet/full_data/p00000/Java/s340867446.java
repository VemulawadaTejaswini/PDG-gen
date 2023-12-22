public static void printTable() {
            for (int i = 0; i < 9 * 9; i++) {
            int a = i / 9 + 1;
            int b = i % 9 + 1;
            System.out.println(a + "x" + b + "=" + a * b);
        }
    
    }
}