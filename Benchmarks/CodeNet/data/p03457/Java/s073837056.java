import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] moves = new int[t][3];
        int prevT = sc.nextInt();
        int prevX = sc.nextInt();
        int prevY = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int curT = sc.nextInt();
            int curX = sc.nextInt();
            int curY = sc.nextInt();

            int dist = curX + curY - prevX - prevY;
            int diffT = curT - prevT;
            if(dist < diffT || dist % 2 != diffT % 2) {
                System.out.println("No");
                return;
            }

            prevT = curT;
            prevX = curX;
            prevY = curY;
        }


        
        System.out.println("Yes");
    }
}
