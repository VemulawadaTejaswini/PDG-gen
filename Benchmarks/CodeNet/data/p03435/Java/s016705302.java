import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] c = new int[4][4];
        c[1][1]=scanner.nextInt();
        c[1][2]=scanner.nextInt();
        c[1][3]=scanner.nextInt();
        c[2][1]=scanner.nextInt();
        c[2][2]=scanner.nextInt();
        c[2][3]=scanner.nextInt();
        c[3][1]=scanner.nextInt();
        c[3][2]=scanner.nextInt();
        c[3][3]=scanner.nextInt();
        boolean b1 = c[2][1]-c[1][1]==c[2][2]-c[1][2]&&c[2][2]-c[1][2]==c[2][3]-c[1][3];
        boolean b2 = c[3][1]-c[2][1]==c[3][2]-c[2][2]&&c[3][2]-c[2][2]==c[3][3]-c[2][3];
        boolean b3 = c[1][2]-c[1][1]==c[2][2]-c[2][1]&&c[2][2]-c[2][1]==c[3][2]-c[3][1];
        boolean b4 = c[1][3]-c[1][2]==c[2][3]-c[2][2]&&c[2][3]-c[2][2]==c[3][3]-c[3][2];
        if (b1&&b2&&b3&&b4){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}