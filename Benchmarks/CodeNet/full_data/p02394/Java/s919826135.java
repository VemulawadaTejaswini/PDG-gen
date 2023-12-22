import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        int x, y, r, w, h;
        String s = "No";
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();

        if (h-y-r >= 0 && y-r >= 0 && w-x-r >= 0 && x-r >= 0)
            s = "Yes";
        System.out.println(s);
    }
}
