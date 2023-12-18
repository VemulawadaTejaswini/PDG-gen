import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int currentX = 0;
        int currentY = 0;
        int currentTime = 0;
        for(int i = 0; i < n; i++) {
            if(!canGo(currentX, currentY, currentTime, x[i], y[i], t[i])) {
                System.out.println("No");
                return;
            }
            currentX = x[i];
            currentY = y[i];
            currentTime = t[i];
        }
        System.out.println("Yes");
    }
    private static boolean canGo(int currentX, int currentY, int currentTime, int destX, int destY, int destTime) {
        if(currentX == destX && currentY == destY && currentTime == destTime) return true;
        if(currentTime >= destTime) return false;
        return canGo(currentX+1, currentY, currentTime+1, destX, destY, destTime)||
                canGo(currentX, currentY+1, currentTime+1, destX, destY, destTime)||
                canGo(currentX-1, currentY, currentTime+1, destX, destY, destTime)||
                canGo(currentX, currentY-1, currentTime+1, destX, destY, destTime);
    }
}
