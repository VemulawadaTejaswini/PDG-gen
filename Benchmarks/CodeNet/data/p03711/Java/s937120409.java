import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(whichGroup(x) == whichGroup(y) ? "Yes" : "No");
    }

    private static int whichGroup(int n) {
        int group = 0 ;
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                group = 1;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                group =  2;
            break;
            case 2:
                group =  3;
            break;
        }
        return group;
    }
}
