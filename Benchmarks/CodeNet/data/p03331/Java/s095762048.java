import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNum = scanner.nextInt();
        int currentTarget = 0;
        for(int i=1; i<givenNum; i++) {
            int target1 = 0;
            int target2 = 0;
            int num1 = i;
            int num2 = givenNum - i;
            while(num1 > 0) {
                target1 += num1 % 10;
                num1 /= 10;
            }
            while(num2 > 0) {
                target2 += num2 % 10;
                num2 /= 10;
            }
            if(i == 1) {
                currentTarget = target1 + target2;
            }
            if(currentTarget > target1 + target2) {
                currentTarget = target1 + target2;
            }
        }
        System.out.println(currentTarget);
    }
}
