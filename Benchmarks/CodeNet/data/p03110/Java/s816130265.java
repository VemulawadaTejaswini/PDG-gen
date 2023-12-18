import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        float sum=0;
        for (int i = 0; i < N; i++) {
            float x=scan.nextFloat();
            String u=scan.next();
            sum+=x*(u.equals("JPY")?1:380000);
        }

        System.out.println(sum);
    }
}
