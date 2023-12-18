import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;

        if(a <= k){
            sum += a;
            k = k - a;
            if(k == 0){
                System.out.println(sum);
                return;
            }
        }else{
            sum += k;
            System.out.println(sum);
            return;
        }

        if(b <= k){
            k = k - b;
            if(k == 0){
                System.out.println(sum);
                return;
            }
        }else{
            System.out.println(sum);
            return;
        }

        sum -= k;
        System.out.println(sum);

    }
}
