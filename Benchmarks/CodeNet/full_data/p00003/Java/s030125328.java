import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

      

        int times = scan.nextInt();

        int[][] delta = new int[times][3];

        for (int i = 0; i < times; i++) {

            int edge1 = scan.nextInt();
            int edge2 = scan.nextInt();
            int edge3 = scan.nextInt();

            delta[i][0] = edge1;
            delta[i][1] = edge2;
            delta[i][2] = edge3;

        }

        for (int i = 0; i < times; i++) {
            if ((delta[i][0]) * (delta[i][0]) == (delta[i][1]) * (delta[i][1]) + (delta[i][2]) * (delta[i][2])
                    || (delta[i][1]) * (delta[i][1]) == (delta[i][0]) * (delta[i][0]) + (delta[i][2]) * (delta[i][2])
                    || (delta[i][2]) * (delta[i][2]) == (delta[i][0]) * (delta[i][0]) + (delta[i][1]) * (delta[i][1])) {

                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scan.close();

    }

}