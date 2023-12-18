import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int price = b * 10; b < b * 11; b++){
            if((int) price * 0.08 == a && (int) price * 0.1 == b){
                System.out.println(price);
                return;
            }
        }
        System.out.println(-1);
    }
}