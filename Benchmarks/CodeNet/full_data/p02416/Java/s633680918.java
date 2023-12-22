import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            if(number.equals("0")){
                break;
            }
            int sum = 0;
            for(int i = 0; i < number.length(); i++){
                sum = sum + (number.charAt(i) - '0');
            }
            System.out.println(sum);
        }
    }
}
