import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> nums = new ArrayList<Integer>();

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            nums.add(scan.nextInt());
        }

        Collections.sort(nums);

        System.out.println(join(nums, " "));
    }

    private static <T> String join(List<T> list, String separator) {
        StringBuilder sb = new StringBuilder();

        boolean isFirstItem = true;
        for (T item : list) {
            if (isFirstItem) {
                isFirstItem = false;
            } else {
                sb.append(separator);
            }
            sb.append(item);
        }

        return sb.toString();
    }

}