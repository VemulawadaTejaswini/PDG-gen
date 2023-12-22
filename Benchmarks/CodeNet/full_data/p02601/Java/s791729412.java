import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = Integer.parseInt(sc.next());
        int green = Integer.parseInt(sc.next());
        int blue = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String ans = "No";
        while (k > 0) {
            if (green <= red) {
                green *= 2;
                k--;
            } else if (blue <= green) {
                blue *= 2;
                k--;
            }
            if ((green > red) && (blue > green)) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
