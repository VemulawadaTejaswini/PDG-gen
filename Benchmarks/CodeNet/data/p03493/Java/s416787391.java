import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] args = sc.next().split("");

        int nums1 =Integer.parseInt(args[0]);
        int nums2 =Integer.parseInt(args[1]);
        int nums3 =Integer.parseInt(args[2]);

        int sum = nums1 + nums2 + nums3;
         System.out.println(sum);
    }
}