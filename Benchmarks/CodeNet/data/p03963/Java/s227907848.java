public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k*Math.max((n-1)*(k-1), 1));
    }
}
