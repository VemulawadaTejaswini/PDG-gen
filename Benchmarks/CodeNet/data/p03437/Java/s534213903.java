public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        long ans = x;
        if (x % y == 0) {
            ans = -1;
        }
        System.out.println(ans);
    }
}