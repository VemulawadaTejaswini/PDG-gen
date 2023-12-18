import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int a = n / 100;

        int b = (n / 10) % 10;

        int c = n % 10;

        int maxNum;
        if (a >= b){
            if (a > c){
                maxNum = a;
            }else{
                maxNum = c;
            }
        }else{
            if (b >= c){
                maxNum = b;
            }else{
                maxNum = c;
            }
        }

        System.out.println(maxNum * 100 + maxNum * 10 + maxNum);

    }
}