import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = a / k;
        int p = a % k;
        if(p == 0 || (t + 1) * k <= b){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}