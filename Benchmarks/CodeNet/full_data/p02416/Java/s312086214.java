import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input, sum;

        while(true){
            sum = 0;
            input = scanner.nextInt();

            if(input == 0){
                break;
            }

            while (input > 0){
                sum += input % 10;
                input /= 10;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}

