import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int result = 0;
        if(s1 == 1){
            result += 1;
        }
        if(s2 == 1){
            result += 1;
        }
        if(s3 == 1){
            result += 1;
        }

        System.out.println(result);

    }
}