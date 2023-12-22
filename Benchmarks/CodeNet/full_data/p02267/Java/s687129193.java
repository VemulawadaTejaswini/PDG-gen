import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] targetArray = new int[n + 1];
        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++) targetArray[i] = Integer.parseInt(input[i]);

        // 空読み
        sc.nextLine();
        int[] searchNums = Arrays.stream(sc.nextLine().split(" "))
                                               .mapToInt(s -> Integer.parseInt(s))
                                               .toArray();

        System.out.println(linearSearch(targetArray, searchNums));

    }

    private static int linearSearch(int[] targetArray, int[] searchNums) {

        int targetEnd = targetArray.length - 1;
        int cnt = 0;

        for(int num: searchNums) {

            int i = 0;
            targetArray[targetEnd] = num;
            while(targetArray[i] != num) {
                i++;
            }
            if(i != targetEnd) {
                cnt++;
            }

        }

        return cnt;
    }

}

