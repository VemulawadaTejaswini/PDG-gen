import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int tmp = 0;
        int target = 0;
        int orgNum = givenNumber;
        while(0 < givenNumber) {
            tmp = givenNumber % 10;
            target += tmp;
            givenNumber /= 10;
        }
        if(orgNum % target == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
