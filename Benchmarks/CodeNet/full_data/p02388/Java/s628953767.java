import java.util.Scanner;
class itp11b {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        int ans = x*x*x;
        
        System.out.println(ans);
    }
}