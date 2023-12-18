import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int range = 2*D+1;
        int result;
        if (N%range == 0){
            result = N / range;
        }else{
            result = N / range + 1;
        }

        System.out.println(result);
    }
}
