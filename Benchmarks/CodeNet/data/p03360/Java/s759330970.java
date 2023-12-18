public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();
        int sum = a + b + c;
        int max = Math.max(Math.max(a, b), c);
        sum = sum - max;
        for (int i = 0; i < k; i++) {
            max = max * 2;
        }
        sum = sum + max;
        System.out.println(sum);
    }

}