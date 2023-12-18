import java.util.*;

class Main{

    public static int solve(int n, int k, String invalidNumbers) {
        int start = n;

        while(true) {
            boolean isNotUsable = Arrays.stream(Integer.toString(start).split(""))
                .anyMatch(number -> invalidNumbers.contains(number));

            if (!isNotUsable) {
                return start;
            }

            start++;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        String line = scanner.next();
        String invalidNumbers = line.replace(" ", "");

        int ans = Main.solve(n, k, invalidNumbers);
        // int[] arr = Arrays.stream(line.split(" "))
        //     .mapToInt(Integer::parseInt)
        //     .toArray();

        System.out.println(ans);
    }
}
