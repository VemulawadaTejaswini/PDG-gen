import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        char[] RGBs = S.toCharArray();
        List<Integer> rList = new ArrayList<>();
        List<Integer> gList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            switch (RGBs[i]) {
                case 'R':
                    rList.add(i);
                    break;
                case 'G':
                    gList.add(i);
                    break;
                case 'B':
                    bList.add(i);
                    break;
            }
        }
        long ans = 0;

        for (int i = 0; i < rList.size(); i++) {
            for (int j = 0; j < gList.size(); j++) {
                for (int k = 0; k < bList.size(); k++) {
                    int[] nums = new int[] { rList.get(i), gList.get(j), bList.get(k) };
                    Arrays.sort(nums);
                    if (nums[2] - nums[1] != nums[1] - nums[0]) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);

    }

}
