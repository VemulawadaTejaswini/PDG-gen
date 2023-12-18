import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};
    static int[] x8 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] y8 = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        int l = s.length();
        boolean cond = true;
        HashMap<Character, Character> mapFromS = new HashMap<>();
        HashMap<Character, Character> mapFromT = new HashMap<>();
        for(int i = 0; i < l; i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if(!mapFromS.containsKey(si)) {
                mapFromS.put(si, ti);
            }
            if(!mapFromT.containsKey(ti)) {
                mapFromT.put(ti, si);
            }

            if(mapFromS.containsKey(si) && mapFromS.get(si) != ti) {
                cond = false;
                break;
            }

            if(mapFromT.containsKey(ti) && mapFromT.get(ti) != si) {
                cond = false;
                break;
            }
        }

        if(cond) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    static public void printArray2D(char[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%c\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }

    static public void printArray2D(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%d\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}
