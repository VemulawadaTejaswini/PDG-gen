package abc124;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().split("")[0]);
        String[] nums = sc.nextLine().split(" ");

        int max = 0;
        int cnt = 0;
        for (String num : nums) {
            int h = Integer.parseInt(num);
            if (max <= h) {
                cnt++;
                max = h;
            }
        }
        System.out.println(cnt);

//        int min = 100;
//        for (String num : nums) {
//            int h = Integer.parseInt(num);
//            if (min > h) {
//                min = h;
//            }
//        }
//
//        int cnt = 0;
//        for (String num : nums) {
//            int h = Integer.parseInt(num);
//            if (min == h) {
//                cnt++;
//            }
//        }
//        System.out.println(n - cnt);

//        int min = 0;
//        int ngCnt = 0;
//        int first = 0;
//        for (int i = 0; i < n; i++) {
//            int h = Integer.parseInt(nums[i]);
//            if (i == 0) {
//                first = h;
//                min = h;
//                continue;
//            }
//
//            if (min == h) {
//                ngCnt++;
//                continue;
//            }
//
//            if (min > h) {
//                min = h;
//                ngCnt++;
//            }
//        }
//        if (min > first) {
//            ngCnt++;
//        }
//
//        System.out.println(n - ngCnt);
    }
}
