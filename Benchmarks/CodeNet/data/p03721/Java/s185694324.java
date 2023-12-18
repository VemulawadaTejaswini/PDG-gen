import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int n = Integer.parseInt(lines[1]);
        int sum = 0;
        lines = sc.nextLine().split(" ");
        String result = lines[0];
        while (sum < n - 1 && sc.hasNext()) {
            sum += Integer.parseInt(lines[1]);
            result = lines[0];
            lines = sc.nextLine().split(" ");
        }
        System.out.println(result);
    }
}
