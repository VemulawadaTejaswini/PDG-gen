import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String rawNums = scan.nextLine();
            if (rawNums.equals("0"))
                break;

            int sum = 0;
            for (char rawnum : rawNums.toCharArray()) {
                int num = rawnum - '0';
                sum += num;
            }

            System.out.println(sum);
        }
    }
}