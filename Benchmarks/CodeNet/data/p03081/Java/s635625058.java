import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String tiles = sc.next();
        String[] t = new String[q];
        String[] d = new String[q];
        for(int i=0;i<q;i++) {
            t[i] = sc.next();
            d[i] = sc.next();
        }
        // for(int i=0;i<q;i++) System.out.println(t[i]);
        // for(int i=0;i<q;i++) System.out.println(d[i]);
        int ok = -1;
        int ng = n;
        while(ok < ng - 1) {
            int mid = (ok+ng)/2;
            // System.out.println(mid);
            if (leftOut(mid, q, tiles, t, d)) {
                // System.out.println("Leftout");
                ok = mid;
            } else {
                // System.out.println("NotLeftout");
                ng = mid;
            }
        }
        int leftOutMax = ok;
        ng = -1;
        ok = n;
        while(ok > ng + 1) {
            int mid = (ok+ng)/2;
            // System.out.println(mid);
            if (rightOut(mid, q, tiles, t, d)) {
                // System.out.println("Leftout");
                ok = mid;
            } else {
                // System.out.println("NotLeftout");
                ng = mid;
            }
        }
        int rightOutMin = ok;
        int answer;
        if (rightOutMin < leftOutMax) {
            answer = n;
        } else {
            answer = leftOutMax + 1 + (n-rightOutMin);
        }
        System.out.println(n-answer);
    }
    public static boolean leftOut(int startIndex, int directionNum, String tile, String[] directionT, String[] directionLR) {
        int tileLength = tile.length();
        if (startIndex < 0) return(true);
        if (startIndex >= tileLength) return(false);
        char currentTile = tile.charAt(startIndex);    
        int currentIndex = startIndex;
        for(int i=0;i<directionNum;i++){
            String target = directionT[i];
            char direction = directionLR[i].charAt(0);
            // System.out.println(direction);
            if (target.charAt(0) != currentTile) {
                continue;
            }
            if (direction == 'L') {
                currentIndex--;
                // System.out.println(currentIndex);
            } else if (direction == 'R') {
                currentIndex++;
                // System.out.println(currentIndex);
            } else {
                // System.out.println("ERROR");
            }
            if (currentIndex < 0) {
                return(true);
            } else if (currentIndex >= tileLength) {
                return(false);
            } else {
                currentTile = tile.charAt(currentIndex);
            }
        }
        return(false);
    }
    public static boolean rightOut(int startIndex, int directionNum, String tile, String[] directionT, String[] directionLR) {
        int tileLength = tile.length();
        if (startIndex < 0) return(false);
        if (startIndex >= tileLength) return(true);
        char currentTile = tile.charAt(startIndex);    
        int currentIndex = startIndex;
        for(int i=0;i<directionNum;i++){
            String target = directionT[i];
            char direction = directionLR[i].charAt(0);
            if (target.charAt(0) != currentTile) {
                continue;
            }
            if (direction == 'L') {
                currentIndex--;
            } else if (direction == 'R') {
                currentIndex++;
            } else {
            }
            if (currentIndex < 0) {
                return(false);
            } else if (currentIndex >= tileLength) {
                return(true);
            } else {
                currentTile = tile.charAt(currentIndex);
            }
        }
        return(false);
    }
}