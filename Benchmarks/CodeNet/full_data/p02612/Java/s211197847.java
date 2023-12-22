import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calc(n));
        sc.close();
    }

    public static int calc(int n){
        if(n % 1000 == 0){
            return 0;
        }else{
            return 1000 - n % 1000;
        }
    }
}