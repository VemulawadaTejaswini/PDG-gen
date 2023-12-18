class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(buildStairs(arr));


    }

    public static boolean buildStairs(long[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            long diff = arr[i] - arr[i-1];
            if (diff < -1) return false;
            else if (diff == -1 && count == -1) return false;
            else if (diff == -1) count--;
            else count = 0;
        }

        return true;
    }
}