import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int one = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        one = scanner.nextInt();

        if (one == 1) {
            sum++;
        } 
        
        System.out.println(sum);

        scanner.close();
    }
}
