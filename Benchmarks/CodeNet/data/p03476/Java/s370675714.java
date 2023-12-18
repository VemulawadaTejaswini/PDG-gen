import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for (int i = 0; i < Q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();

            int sum = 0;
            for (int j = l; j <= r; j++) {
                if (isPrime(j) && isPrime((int)((j + 1) / 2))) sum++;
            }
            System.out.println(sum);
        }
    }
    public static boolean isPrime(int j) {
        for(int i = 2; i<= j;i++){    //最小的素数是2
            if(j % i == 0 && i != j){   //除了1和本身之后没有约数即为素数
                //System.out.println("不是素数");
                return false;
            }else if(i == j){

                //System.out.println("是素数");
                return true;
            }
        }
        return true;
    }

}