import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = n / 2;
            int y = n % 2;
            for (int i = 0; i < x; i++) {
                if(a % 2 != 0){
                    a --;
                }
                a = a / 2;
                b += a;
                if(b % 2 !=0){
                    b --;
                }
                b = b / 2;
                a += b;
            }
            if(y != 0){
                if(a % 2 != 0){
                    a --;
                }
                a = a / 2;
                b += a;
            }
            System.out.println(a + " " + b);
        }
    }
}