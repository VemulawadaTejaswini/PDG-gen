public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        System.out.println(k*Math.max((n-1)*(k-1), 1));
    }
}
