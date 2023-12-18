public class Solution {
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = n + "";
        if (s.indexOf("9") != -1) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}