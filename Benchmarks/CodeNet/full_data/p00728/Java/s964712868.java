import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        while (true){
            int referee = sc.nextInt();
            if (referee == 0) break;
            int sum = sc.nextInt(), max = sum, min = sum;
            for (int i = 1; i < referee; i++){
                tmp = sc.nextInt();
                sum += tmp;
                if(tmp >= max) max = tmp;
                else if(tmp <= min) min = tmp;
            }
            sum -= max + min;
            System.out.println(sum / (referee - 2));
        }
    }
}