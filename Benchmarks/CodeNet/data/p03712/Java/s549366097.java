import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String[] image = new String[h];
        for (int i = 0; i < h; i++) {
            image[i] = sc.next();
        }

        String wall = "##";
        for (int i = 0; i < w; i++) {
            wall += "#";
        }

        System.out.println(wall);
        for (int i = 0; i < h; i++) {
            image[i] = "#" + image[i] + "#";
            System.out.println(image[i]);
        }
        System.out.println(wall);
    }
}