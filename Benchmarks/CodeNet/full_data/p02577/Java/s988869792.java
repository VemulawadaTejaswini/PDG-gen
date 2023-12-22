import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int sum = 0;
        for(char num : N.toCharArray()) {
            int n = num - '0';
            sum += n;
        }
        if(sum % 9 == 0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}