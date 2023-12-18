import java.util.Scanner;
 
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);  
        int a = scanner.nextInt();  
        int b = scanner.nextInt();
        int ans = (a - 1) * (b - 1);
        System.out.println(ans);
    }
}
