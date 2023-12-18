import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rgbStr = sc.nextLine().split(" ");
        int rgb = Integer.parseInt(rgbStr[0]+rgbStr[1]+rgbStr[2]);

        if(rgb % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
